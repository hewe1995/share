package com.hewe.footmark.dao;

import java.util.List;

import com.hewe.footmark.domain.Footmark;
import com.hewe.sys.dao.BasicDao;

public interface FootmarkDao extends BasicDao<Footmark, Long> {
	/**
	 * 通过location的id获取
	 * 
	 * @param id
	 * @return
	 */
	public List<Footmark> listByLocation(long id, int start, int size);
}
