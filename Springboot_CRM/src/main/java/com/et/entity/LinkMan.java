package com.et.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 联系人实体
 * @author Administrator
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LinkMan {

	private Integer id; // 编号
	private Customer customer; // 所属客户
	private String linkName; // 姓名
	private String sex; // 性别
	private String zhiwei; // 职位
	private String officePhone; // 办公电话
	private String phone; // 手机

	
}
