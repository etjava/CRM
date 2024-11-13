package com.et.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 客户流失实体
 * @author Administrator
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerLoss {

	private Integer id; // 编号
	private String cusNo; // 客户编号
	private String cusName; // 客户名称
	private String cusManager; // 客户经理
	private Date lastOrderTime; // 上次下单日期
	private Date confirmLossTime; // 确认流失日期
	private Integer state; // 状态 0 暂缓流失 1 确认流失
	private String lossReason; // 流失原因

	
}
