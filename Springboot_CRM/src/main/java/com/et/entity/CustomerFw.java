package com.et.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 客户服务分析实体
 * @author Administrator
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerFw {

	private String serveType; // 服务类型
	private int num; // 数量
	

	
}
