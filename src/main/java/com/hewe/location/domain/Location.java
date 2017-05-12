package com.hewe.location.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.hewe.sys.domain.DefaultDomain;

/**
 * 一个具体的地点,比如保定学院,甚至是A楼,203教室等等
 * 
 * @author hewe
 *
 */
@Entity
@Table(name = "location")
public class Location extends DefaultDomain {
	private Long id;
	private String name;
	private String description;
	private Double latitude;
	private Double longitude;
	private String address;// 全地址字符串
	private LocationType type;// 地点类型
	private Date createtime;
	private Date updatetime;
	private Integer status = 0;

	public Location() {
	}

	public Location(Long id, String name, Double longitude, Double latitude, Date createtime, Date updatetime) {
		super();
		this.id = id;
		this.name = name;
		this.latitude = latitude;
		this.longitude = longitude;
		this.createtime = createtime;
		this.updatetime = updatetime;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}

	@Column(length = 40, nullable = false)
	public String getName() {
		return name;
	}

	@Column(length = 255)
	public String getDescription() {
		return description;
	}

	@Column
	public Double getLatitude() {
		return latitude;
	}

	@Column
	public Double getLongitude() {
		return longitude;
	}

	@Column(length = 200)
	public String getAddress() {
		return address;
	}

	@Enumerated(EnumType.STRING)
	@Column(length = 40)
	public LocationType getType() {
		return type;
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
	public Integer getStatus() {
		return status;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setType(LocationType type) {
		this.type = type;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}
