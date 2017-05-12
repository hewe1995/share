package com.hewe.user.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.hewe.sys.domain.DefaultDomain;

@Entity
@Table(name = "verification_code")
public class VerificationCode extends DefaultDomain {

	public static final int STATUS_UNCHECK = 0;
	public static final int STATUS_CHECKED = 1;

	private Long id;
	private String indentity;
	private Integer code;
	private Date createtime;
	private Date updatetime;
	private Integer status = 0;// 是否验证

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(nullable = false, unique = true, length = 100)
	public String getIndentity() {
		return indentity;
	}

	public void setIndentity(String indentity) {
		this.indentity = indentity;
	}

	@Column(nullable = false)
	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	@Column
	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	@Column
	public Date getUpdatetime() {
		return updatetime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

	@Column
	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
}
