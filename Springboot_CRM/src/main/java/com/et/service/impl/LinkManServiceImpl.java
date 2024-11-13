package com.et.service.impl;

import com.et.dao.LinkManDao;
import com.et.entity.LinkMan;
import com.et.service.LinkManService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 联系人Service实现类
 * @author Administrator
 *
 */
@Service("linkManService")
public class LinkManServiceImpl implements LinkManService{

	@Resource
	private LinkManDao linkManDao;
	
	@Override
	public List<LinkMan> find(Map<String, Object> map) {
		return linkManDao.find(map);
	}

	@Override
	public Long getTotal(Map<String, Object> map) {
		return linkManDao.getTotal(map);
	}

	@Override
	public int update(LinkMan linkMan) {
		return linkManDao.update(linkMan);
	}

	@Override
	public int add(LinkMan linkMan) {
		return linkManDao.add(linkMan);
	}

	@Override
	public int delete(Integer id) {
		return linkManDao.delete(id);
	}

}
