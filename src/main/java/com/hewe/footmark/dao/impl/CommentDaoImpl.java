package com.hewe.footmark.dao.impl;

import org.springframework.stereotype.Repository;

import com.hewe.footmark.dao.CommentDao;
import com.hewe.footmark.domain.FootmarkComment;
import com.hewe.sys.dao.impl.BasicDaoImpl;

@Repository
public class CommentDaoImpl extends BasicDaoImpl<FootmarkComment, Long> implements CommentDao {

	@Override
	public int count(long targetId) {
		return 4;
	}

}
