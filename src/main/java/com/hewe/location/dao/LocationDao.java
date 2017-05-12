package com.hewe.location.dao;

import java.util.List;

import com.hewe.location.domain.Location;
import com.hewe.sys.dao.BasicDao;

public interface LocationDao extends BasicDao<Location, Long> {
	/**
	 * 通过经纬度查找附近一个地点
	 * 
	 * @param latitude
	 *            纬度
	 * @param longitude
	 *            经度
	 * @return
	 */
	public List<Location> searchLocationNearbyGeographic(double longitude, double latitude);

	/**
	 * 通过经纬度查找附近一个地点
	 * 
	 * @param latitude
	 *            纬度
	 * @param longitude
	 *            经度
	 * @param name
	 *            要查的名称
	 * @return
	 */
	public List<Location> searchLocationNearbyGeographic(double longitude, double latitude, String name);

}
