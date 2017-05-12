package com.hewe.location.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.hewe.location.dao.LocationDao;
import com.hewe.location.domain.Location;
import com.hewe.location.domain.LocationType;
import com.hewe.sys.dao.impl.BasicDaoImpl;

@Repository
public class LocationDaoImpl extends BasicDaoImpl<Location, Long> implements LocationDao {

	@Override
	public List<Location> searchLocationNearbyGeographic(double longitude, double latitude) {
		log.debug("searchLocationNearbyGeographic" + longitude + ">" + latitude);
		List<Location> list = new ArrayList<Location>();
		Location local2 = new Location(1L, "保定学院", 115.578461, 38.880253, new Date(), new Date());
		local2.setType(LocationType.SCHOOL);
		Location local3 = new Location(2L, "河北大学", 115.578461, 38.880253, new Date(), new Date());
		local3.setType(LocationType.SCHOOL);

		Location local4 = new Location(3L, "汉庭酒店", 115.578461, 38.880253, new Date(), new Date());
		local4.setType(LocationType.HOTEL);
		list.add(local2);
		list.add(local3);
		list.add(local4);
		return list;
	}

	@Override
	public List<Location> searchLocationNearbyGeographic(double longitude, double latitude, String name) {

		log.debug("searchLocationNearbyGeographic" + longitude + ">" + name + ">" + name);

		List<Location> list = new ArrayList<Location>();
		Location local2 = new Location(1L, "保定学院", 115.578461, 38.880253, new Date(), new Date());
		local2.setType(LocationType.SCHOOL);
		Location local3 = new Location(2L, "河北大学", 115.578461, 38.880253, new Date(), new Date());
		local3.setType(LocationType.SCHOOL);

		Location local4 = new Location(3L, "汉庭酒店", 115.578461, 38.880253, new Date(), new Date());
		local4.setType(LocationType.HOTEL);
		list.add(local2);
		list.add(local3);
		list.add(local4);
		return list;

	}

}
