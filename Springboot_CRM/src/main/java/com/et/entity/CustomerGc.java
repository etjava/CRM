package com.et.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 客户构成分析实体
 * @author Administrator
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerGc {

	private String customerLevel; // 客户等级
	private int customerNum; // 客户数量

}
