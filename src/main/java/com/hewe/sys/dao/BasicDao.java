package com.hewe.sys.dao;

import java.io.Serializable;

import com.hewe.sys.domain.BasicDomain;

public interface BasicDao<M extends BasicDomain, K extends Serializable> {
	public void create(M t);

	public M findById(K k);

	public void update(M t);

	public int totalCount();
	public void deleteById(K k);
}
