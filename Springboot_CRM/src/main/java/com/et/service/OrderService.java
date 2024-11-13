package com.et.service;

import com.et.entity.Order;

import java.util.List;
import java.util.Map;

/**
 * 订单Service接口
 * @author Administrator
 *
 */
public interface OrderService {

	/**
	 * 查询订单集合
	 * @param map
	 * @return
	 */
	public List<Order> find(Map<String,Object> map);
	
	
	/**
	 * 获取总记录数
	 * @param map
	 * @return
	 */
	public Long getTotal(Map<String,Object> map);


	/**
	 * 根据订单ID查询订单信息
	 * @param parseInt
	 * @return
	 */
	Order findById(int parseInt);
}
