package com.et.service.impl;

import com.et.dao.ProductDao;
import com.et.entity.Product;
import com.et.service.ProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 产品Service实现类
 * @author Administrator
 *
 */
@Service("productService")
public class ProductServiceImpl implements ProductService{

	@Resource
	private ProductDao productDao;
	
	@Override
	public List<Product> find(Map<String, Object> map) {
		return productDao.find(map);
	}

	@Override
	public Long getTotal(Map<String, Object> map) {
		return productDao.getTotal(map);
	}

}
