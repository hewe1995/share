package com.hewe.footmark.dao;

import com.hewe.footmark.domain.FootmarkLike;
import com.hewe.sys.dao.BasicDao;

public interface FootmarkLikeDao extends BasicDao<FootmarkLike, Long> {
	/**
	 * 喜欢数量
	 * 
	 * @param targetId
	 * @return
	 */
	public int count(long targetId);

	/**
	 * 点赞或取消赞
	 * 
	 * @param targetId
	 * @param creatorId
	 */
	public void like(long targetId, String creatorId);
}
