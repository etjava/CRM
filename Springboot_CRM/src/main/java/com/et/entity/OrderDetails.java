package com.et.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 订单购买商品
 * @author Administrator
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetails {

	private Integer id; // 编号
	private Order order; // 所属订单
	private String goodsName; // 商品名称
	private int goodsNum; // 商品数量
	private String unit; // 单位
	private float price; // 价格
	private float sum; // 总金额

	
	
}
