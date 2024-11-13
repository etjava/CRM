package com.et.dao;

import com.et.entity.DataDic;
import com.et.entity.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 产品Dao接口
 * @author Administrator
 *
 */
@Mapper
public interface ProductDao {

	
	/**
	 * 查询产品集合
	 * @param map
	 * @return
	 */
	public List<Product> find(Map<String,Object> map);
	
	/**
	 * 获取总记录数
	 * @param map
	 * @return
	 */
	public Long getTotal(Map<String,Object> map);

	/**
	 * 修改数据字典
	 * @param dataDic
	 * @return
	 */
	public int update(DataDic dataDic);

	/**
	 * 添加数据字典
	 * @param dataDic
	 * @return
	 */
	public int add(DataDic dataDic);

	/**
	 * 删除数据字典
	 * @param id
	 * @return
	 */
	public int delete(Integer id);

}
