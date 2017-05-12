package com.hewe.footmark.dao;

import com.hewe.footmark.domain.FootmarkComment;
import com.hewe.sys.dao.BasicDao;

public interface CommentDao extends BasicDao<FootmarkComment, Long> {
	/**
	 * 获取目标的评论叔
	 * 
	 * @param targetId
	 * @return
	 */
	public int count(long targetId);
}
