package com.et.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 客户流失暂缓措施实体类
 * @author Administrator
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerReprieve {

	private Integer id; // 编号
	private CustomerLoss customerLoss; // 客户流失
	private String measure; // 暂缓措施

	
}
