package com.hewe.location.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.hewe.sys.domain.DefaultDomain;

@Entity
@Table(name = "address")
public class Address extends DefaultDomain {
	private Long id;
	private Integer suite;
	private String apartment;
	private String street;
	private String town;
	private String district;
	private Integer city_id;
	private Integer province_id;
	private Integer country_id;

	private Double latitude;
	private Double longitude;

	private Date createtime;
	private Date updatetime;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}

	@Column
	public Integer getSuite() {
		return suite;
	}

	@Column(length = 100)
	public String getApartment() {
		return apartment;
	}

	@Column(length = 100)
	public String getStreet() {
		return street;
	}

	@Column(length = 50)
	public String getTown() {
		return town;
	}

	@Column(length = 50)
	public String getDistrict() {
		return district;
	}

	@Column
	public Integer getCity_id() {
		return city_id;
	}

	@Column
	public Integer getProvince_id() {
		return province_id;
	}

	@Column
	public Integer getCountry_id() {
		return country_id;
	}

	@Column
	public Double getLatitude() {
		return latitude;
	}

	@Column
	public Double getLongitude() {
		return longitude;
	}

	@Column
	public Date getCreatetime() {
		return createtime;
	}

	@Column
	public Date getUpdatetime() {
		return updatetime;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setSuite(Integer suite) {
		this.suite = suite;
	}

	public void setApartment(String apartment) {
		this.apartment = apartment;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public void setCity_id(Integer city_id) {
		this.city_id = city_id;
	}

	public void setProvince_id(Integer province_id) {
		this.province_id = province_id;
	}

	public void setCountry_id(Integer country_id) {
		this.country_id = country_id;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

}
