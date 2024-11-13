package com.et.dao;

import com.et.entity.CusDevPlan;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 客户开发计划Dao接口
 * @author Administrator
 *
 */
@Mapper
public interface CusDevPlanDao {

	
	/**
	 * 查询客户开发计划集合
	 * @param map
	 * @return
	 */
	public List<CusDevPlan> find(Map<String,Object> map);
	
	
	/**
	 * 获取总记录数
	 * @param map
	 * @return
	 */
	public Long getTotal(Map<String,Object> map);
	
	/**
	 * 修改客户开发计划
	 * @param cusDevPlan
	 * @return
	 */
	public int update(CusDevPlan cusDevPlan);
	
	/**
	 * 添加客户开发计划
	 * @param cusDevPlan
	 * @return
	 */
	public int add(CusDevPlan cusDevPlan);
	
	/**
	 * 删除客户开发计划
	 * @param id
	 * @return
	 */
	public int delete(Integer id);
	
}
