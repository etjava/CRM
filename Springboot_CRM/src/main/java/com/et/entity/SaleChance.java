package com.et.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


/**
 * 销售机会实体
 * @author Administrator
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SaleChance {

	private Integer id; // 编号
	private String chanceSource; // 机会来源
	private String customerName; // 客户名称
	private int cgjl; // 成功几率
	private String overView; // 概要
	private String linkMan; // 联系人
	private String linkPhone; // 联系电话
	private String description; // 机会描述
	private String createMan; // 创建人 
	private Date createTime; // 创建时间
	private String assignMan; // 指派人
	private Date assignTime; // 指派时间
	
	private Integer state; // 分配状态 0 未分配 1 已分配
	private Integer devResult; // 客户开发状态 0 未开发 1 开发中 2 开发成功 3 开发失败

	
}
