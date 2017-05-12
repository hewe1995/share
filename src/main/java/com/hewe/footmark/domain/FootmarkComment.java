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

@Entity
@Table(name = "footmarkComment")
public class FootmarkComment extends DefaultDomain {
	private Long id;
	private String content;
	private String creator_id;// 创建用户
	private Date createtime;
	private Date updatetime;
	private Boolean justText;// 是否只是一个文本
	private Boolean hasImg;// 是否有图片
	private Boolean hasVideo;// 是否有视频
	private Integer like;// 点赞数量
	private Integer comment;// 评论数量
	private Long target_id;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}

	@Column(length = 255)
	public String getContent() {
		return content;
	}

	@Column(length = 40, nullable = false)
	public String getCreator_id() {
		return creator_id;
	}

	@Column
	public Date getCreatetime() {
		return createtime;
	}

	@Column
	public Date getUpdatetime() {
		return updatetime;
	}

	@Column
	public Boolean getJustText() {
		return justText;
	}

	@Column
	public Boolean getHasImg() {
		return hasImg;
	}

	@Column
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

	@Column(nullable = false)
	public Long getTarget_id() {
		return target_id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public void setLike(Integer like) {
		this.like = like;
	}

	public void setComment(Integer comment) {
		this.comment = comment;
	}

	public void setTarget_id(Long target_id) {
		this.target_id = target_id;
	}
}
