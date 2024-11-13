package com.et.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 交往记录
 * @author Administrator
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contact {

	private Integer id; // 编号
	private Customer customer; // 所属客户
	private Date contactTime; // 交往时间
	private String address; // 交往地点
	private String overView; // 概要

	
}
