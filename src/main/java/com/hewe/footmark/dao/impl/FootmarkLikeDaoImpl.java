package com.hewe.footmark.dao.impl;

import org.springframework.stereotype.Repository;

import com.hewe.footmark.dao.FootmarkLikeDao;
import com.hewe.footmark.domain.FootmarkLike;
import com.hewe.sys.dao.impl.BasicDaoImpl;

@Repository
public class FootmarkLikeDaoImpl extends BasicDaoImpl<FootmarkLike, Long> implements FootmarkLikeDao {

	@Override
	public int count(long targetId) {
		return 56;
	}

	@Override
	public void like(long targetId, String creatorId) {

	}

}
