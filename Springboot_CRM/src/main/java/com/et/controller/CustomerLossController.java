package com.et.controller;

import com.et.entity.CustomerLoss;
import com.et.entity.PageBean;
import com.et.service.CustomerLossService;
import com.et.util.DateJsonValueProcessor;
import com.et.util.ResponseUtil;
import com.et.util.StringUtil;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 客户流失Controller层
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/customerLoss")
public class CustomerLossController {
	
	@Resource
	private CustomerLossService customerLossService;
	
	 
	/**
	 * 分页条件查询客户流失
	 * @param page
	 * @param rows
	 * @param s_customerLoss
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/list")
	public String list(@RequestParam(value="page",required=false)String page,@RequestParam(value="rows",required=false)String rows,CustomerLoss s_customerLoss,HttpServletResponse response)throws Exception{
		PageBean pageBean=new PageBean(Integer.parseInt(page),Integer.parseInt(rows));
		Map<String,Object> map=new HashMap<>();
		map.put("cusName", StringUtil.formatLike(s_customerLoss.getCusName()));
		map.put("cusManager", StringUtil.formatLike(s_customerLoss.getCusManager()));
		map.put("state", s_customerLoss.getState());
		map.put("start", pageBean.getStart());
		map.put("size", pageBean.getPageSize());
		List<CustomerLoss> customerLossList=customerLossService.find(map);
		JsonConfig jsonConfig=new JsonConfig();
		jsonConfig.registerJsonValueProcessor(Date.class, new DateJsonValueProcessor("yyyy-MM-dd"));
		JSONObject result=new JSONObject();
		Long total=customerLossService.getTotal(map);
		JSONArray jsonArray=JSONArray.fromObject(customerLossList,jsonConfig);
		result.put("rows", jsonArray);
		result.put("total", total);
		ResponseUtil.write(response, result);
		return null;
	}

	/**
	 * 通过ID查找实体
	 * @param id
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/findById")
	public String findById(@RequestParam(value="id")String id,HttpServletResponse response)throws Exception{
		CustomerLoss customerLoss=customerLossService.findById(Integer.parseInt(id));
		JsonConfig jsonConfig=new JsonConfig();
		jsonConfig.registerJsonValueProcessor(Date.class, new DateJsonValueProcessor("yyyy-MM-dd"));
		JSONObject jsonObject=JSONObject.fromObject(customerLoss,jsonConfig);
		ResponseUtil.write(response, jsonObject);
		return null;
	}

	/**
	 * 确认客户流失
	 * @param id
	 * @param lossReason
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/confirmLoss")
	public String confirmLoss(int id,String lossReason,HttpServletResponse response)throws Exception{
		CustomerLoss customerLoss=new CustomerLoss();
		customerLoss.setId(id);
		customerLoss.setLossReason(lossReason);
		customerLoss.setConfirmLossTime(new Date());
		customerLoss.setState(1);
		customerLossService.update(customerLoss);
		JSONObject result=new JSONObject();
		result.put("success", true);
		ResponseUtil.write(response, result);
		return null;
	}
}
