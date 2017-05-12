package com.hewe.sys.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 用户抽象类
 * 
 * @author harvey 2017年3月19日<br>
 *         version:
 */
@MappedSuperclass
public abstract class BasicUser implements BasicDomain {
	private String id;
	private String password;
	private String salt; // 加密密码的盐
	private Boolean locked = Boolean.FALSE;
	private Boolean available;
	private Date createtime;
	private Date updatetime;

	public BasicUser() {
	}

	public BasicUser(String loginname, String password, String salt, Boolean locked, Boolean available) {
		super();
		this.password = password;
		this.salt = salt;
		this.locked = locked;
		this.available = available;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BasicUser other = (BasicUser) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BasicUser [id=" + id + ", password=" + password + ", salt=" + salt + ", locked=" + locked
				+ ", available=" + available + "]";
	}

	@Id
	// 配置uuid，本来jpa是不支持uuid的，但借用hibernate的方法可以实现。
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid")
	public String getId() {
		return id;
	}

	@JsonIgnore
	@Column(length = 40, nullable = false)
	public String getPassword() {
		return password;
	}

	@JsonIgnore
	@Column(length = 100)
	public String getSalt() {
		return salt;
	}

	@Column
	public Boolean getLocked() {
		return locked;
	}

	@Column
	public Boolean getAvailable() {
		return available;
	}

	@Column
	public Date getCreatetime() {
		return createtime;
	}

	@Column
	public Date getUpdatetime() {
		return updatetime;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public void setLocked(Boolean locked) {
		this.locked = locked;
	}

	public void setAvailable(Boolean available) {
		this.available = available;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}
}
