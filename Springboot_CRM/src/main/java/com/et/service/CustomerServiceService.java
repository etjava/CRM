package com.et.service;

import java.util.List;
import java.util.Map;

/**
 * 客户服务Service接口
 * @author Administrator
 *
 */
public interface CustomerServiceService {

	/**
	 * 添加客户服务
	 * @param customerService
	 * @return
	 */
	public int add(com.et.entity.CustomerService customerService);

	/**
	 * 查询客户服务
	 * @param map
	 * @return
	 */
	public List<com.et.entity.CustomerService> find(Map<String,Object> map);

	/**
	 * 查询客户服务记录数
	 * @param map
	 * @return
	 */
	public Long getTotal(Map<String,Object> map);

	/**
	 * 修改客户服务
	 * @param customerService
	 * @return
	 */
	public int update(com.et.entity.CustomerService customerService);
}
