package com.et.service.impl;

import com.et.dao.CustomerServiceDao;
import com.et.service.CustomerServiceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 客服服务Service实现类
 * @author Administrator
 *
 */
@Service("customerServiceService")
public class CustomerServiceServiceImpl implements CustomerServiceService{

	@Resource
	private CustomerServiceDao customerServiceDao;
	
	@Override
	public int add(com.et.entity.CustomerService customerService) {
		return customerServiceDao.add(customerService);
	}

	@Override
	public List<com.et.entity.CustomerService> find(Map<String, Object> map) {
		return customerServiceDao.find(map);
	}

	@Override
	public Long getTotal(Map<String, Object> map) {
		return customerServiceDao.getTotal(map);
	}

	@Override
	public int update(com.et.entity.CustomerService customerService) {
		return customerServiceDao.update(customerService);
	}

}
