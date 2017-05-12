package com.hewe.footmark.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.hewe.footmark.dao.FootmarkDao;
import com.hewe.footmark.domain.Footmark;
import com.hewe.sys.dao.impl.BasicDaoImpl;

@Repository
public class FootmarkDaoImpl extends BasicDaoImpl<Footmark, Long> implements FootmarkDao {

	@Override
	public List<Footmark> listByLocation(long id, int start, int size) {
		log.debug("listByLocation=>" + id + "," + start + "," + size);
		Footmark foot1 = new Footmark(1L, 2L, "第一次看到", "dfafd=da#sfeaw", new Date(), new Date(), true, false, false);
		Footmark foot2 = new Footmark(2L, 2L, "整齐的床铺", "eaefae", new Date(), new Date(), true, false, false);
		Footmark foot3 = new Footmark(3L, 2L, "第一次看到", "savwegge", new Date(), new Date(), true, false, false);
		List<Footmark> list = new ArrayList<Footmark>();
		list.add(foot1);
		list.add(foot2);
		list.add(foot3);
		return list;
	}

}
