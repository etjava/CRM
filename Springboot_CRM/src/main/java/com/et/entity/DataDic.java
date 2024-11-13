package com.et.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 数据字典实体类
 * @author Administrator
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DataDic {

	private Integer id; // 编号
	private String dataDicName; // 数据字典名称
	private String dataDicValue; // 数据字典值
	
}
