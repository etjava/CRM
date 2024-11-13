package com.et.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 产品实体
 * @author Administrator
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

	private Integer id; // 编号
	private String productName; // 产品名称
	private String model; // 型号
	private String unit; // 单位
	private Float price; // 价格
	private Integer store; // 库存
	private String remark; // 备注
}
