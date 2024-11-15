package com.et.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 客户服务实体
 * @author Administrator
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerService {

	private Integer id; // 编号
	private String serveType; // 服务类型 1,咨询 2，建议 3，投诉
	private String overview; // 概要
	private String customer; // 客户
	private String state; // 1，新创建 2，已分配 3，已处理 4，已归档
	private String servicerequest; // 服务请求
	private String createPeople; // 创建人
	private Date createTime; // 创建日期
	private String assigner; // 分配人
	private Date assignTime; // 分配日期
	private String serviceProce; // 服务处理
	private String serviceProcePeople; // 服务处理人
	private Date serviceProceTime; // 服务处理日期
	private String serviceProceResult; // 服务处理结果
	private String myd; // 客户满意度

}
