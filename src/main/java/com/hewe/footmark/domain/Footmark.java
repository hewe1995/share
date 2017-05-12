package com.hewe.footmark.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.hewe.sys.domain.DefaultDomain;

/**
 * 用户每一个发表的留念
 * 
 * @author hewe
 *
 */
@Entity
@Table(name = "footmark")
public class Footmark extends DefaultDomain {
	private Long id;
	private Long location_id;// 地点
	private String content;
	private String creator_id;// 创建用户
	private Date createtime;
	private Date updatetime;
	private Boolean justText;// 是否只是一个文本
	private Boolean hasImg;// 是否有图片
	private Boolean hasVideo;// 是否有视频
	private Integer like;// 点赞数量
	private Integer comment;// 评论数量

	public Footmark() {
	}

	public Footmark(Long id, Long location_id, String content, String creator_id, Date createtime, Date updatetime,
			Boolean justText, Boolean hasImg, Boolean hasVideo) {
		super();
		this.id = id;
		this.location_id = location_id;
		this.content = content;
		this.creator_id = creator_id;
		this.createtime = createtime;
		this.updatetime = updatetime;
		this.justText = justText;
		this.hasImg = hasImg;
		this.hasVideo = hasVideo;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}

	@Column(nullable = false)
	public Long getLocation_id() {
		return location_id;
	}

	@Column(length = 255)
	public String getContent() {
		return content;
	}

	@Column(nullable = false)
	public String getCreator_id() {
		return creator_id;
	}

	@Column(nullable = false)
	public Date getCreatetime() {
		return createtime;
	}

	@Column(nullable = false)
	public Date getUpdatetime() {
		return updatetime;
	}

	@Column(nullable = false)
	public Boolean getJustText() {
		if (this.hasImg || this.hasVideo) {
			justText = false;
		} else {
			justText = true;
		}
		return justText;
	}

	@Column(nullable = false)
	public Boolean getHasImg() {
		return hasImg;
	}

	@Column(nullable = false)
	public Boolean getHasVideo() {
		return hasVideo;
	}

	@Transient
	public Integer getLike() {
		return like;
	}

	@Transient
	public Integer getComment() {
		return comment;
	}

	public void setLike(Integer like) {
		this.like = like;
	}

	public void setComment(Integer comment) {
		this.comment = comment;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setLocation_id(Long location_id) {
		this.location_id = location_id;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setCreator_id(String creator_id) {
		this.creator_id = creator_id;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

	public void setJustText(Boolean justText) {
		this.justText = justText;
	}

	public void setHasImg(Boolean hasImg) {
		this.hasImg = hasImg;
	}

	public void setHasVideo(Boolean hasVideo) {
		this.hasVideo = hasVideo;
	}
}
