package com.hewe.footmark.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.hewe.sys.domain.DefaultDomain;

@Entity
@Table(name = "footmarkLike")
public class FootmarkLike extends DefaultDomain {
	private Long id;
	private String creator_id;
	private Boolean isLiked;
	private Long target_id;
	private Date createtime;
	private Date updatetime;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}

	@Column(length = 40, nullable = false)
	public String getCreator_id() {
		return creator_id;
	}

	@Column(nullable = false)
	public Boolean getIsLiked() {
		return isLiked;
	}

	@Column(nullable = false)
	public Long getTarget_id() {
		return target_id;
	}

	@Column(nullable = false)
	public Date getCreatetime() {
		return createtime;
	}

	@Column(nullable = false)
	public Date getUpdatetime() {
		return updatetime;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setCreator_id(String creator_id) {
		this.creator_id = creator_id;
	}

	public void setIsLiked(Boolean isLiked) {
		this.isLiked = isLiked;
	}

	public void setTarget_id(Long target_id) {
		this.target_id = target_id;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

}
