package com.et.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 订单实体
 * @author Administrator
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

	private Integer id; // 编号
	private Customer customer; // 所属客户
	private String orderNo; // 订单号
	private Date orderDate; // 订购日期
	private String address; // 送货地址
	private Integer state; // 状态 0 未回款 1 已回款
}
