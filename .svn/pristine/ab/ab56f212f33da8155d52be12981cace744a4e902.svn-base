package com.hewe.location.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.hewe.sys.domain.DefaultDomain;

@Entity
@Table(name = "province")
public class Province extends DefaultDomain {

	private Integer id;
	private String gdCode;
	private String name;
	private Integer top_id;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}

	@Column(length = 40)
	public String getGdCode() {
		return gdCode;
	}

	@Column(length = 50)
	public String getName() {
		return name;
	}

	@Column
	public Integer getTop_id() {
		return top_id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setGdCode(String gdCode) {
		this.gdCode = gdCode;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTop_id(Integer top_id) {
		this.top_id = top_id;
	}
}
