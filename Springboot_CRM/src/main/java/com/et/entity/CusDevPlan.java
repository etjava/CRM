package com.et.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 客户开发计划实体
 * @author Administrator
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CusDevPlan {

	private Integer id; // 编号
	private SaleChance saleChance; // 销售机会
	private String planItem; // 计划项
	private Date planDate; // 计划日期
	private String exeAffect; // 执行效果

}
