package com.et.service.impl;

import com.et.dao.DataDicDao;
import com.et.entity.DataDic;
import com.et.service.DataDicService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 数据字典Service实现类
 * @author Administrator
 *
 */
@Service("dataDicService")
public class DataDicServiceImpl implements DataDicService{

	@Resource
	private DataDicDao dataDicDao;
	
	@Override
	public List<DataDic> find(Map<String, Object> map) {
		return dataDicDao.find(map);
	}

	@Override
	public List<DataDic> findAll() {
		return dataDicDao.findAll();
	}

	@Override
	public Long getTotal(Map<String, Object> map) {
		return dataDicDao.getTotal(map);
	}

	@Override
	public int update(DataDic dataDic) {
		return dataDicDao.update(dataDic);
	}

	@Override
	public int add(DataDic dataDic) {
		return dataDicDao.add(dataDic);
	}

	@Override
	public int delete(Integer id) {
		return dataDicDao.delete(id);
	}


}
