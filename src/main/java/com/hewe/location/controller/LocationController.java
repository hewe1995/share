package com.hewe.location.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hewe.footmark.dao.FootmarkDao;
import com.hewe.footmark.domain.Footmark;
import com.hewe.location.dao.LocationDao;
import com.hewe.location.domain.Location;
import com.hewe.sys.utils.Content;

@RestController
@RequestMapping("/location")
public class LocationController {

	private Logger log = LoggerFactory.getLogger(getClass());

	private LocationDao locationDao;

	private FootmarkDao footmarkDao;

	/**
	 * 通过经纬度和名称查找附近的地点
	 * 
	 * @param longitude
	 * @param latitude
	 * @param name
	 * @return
	 */
	@GetMapping("/searchNearby/{name}")
	public ResponseEntity<?> searchLocationNearbyName(@RequestParam(name = "longitude") double longitude,
			@RequestParam(name = "latitude") double latitude, @PathVariable(name = "name") String name) {
		log.debug("通过经纬度和名称获取附近的地点");
		List<Location> results = locationDao.searchLocationNearbyGeographic(longitude, latitude, name);

		return ResponseEntity.ok(Content.ok(results));
	}

	/**
	 * 通过经纬度查找附近的地点
	 * 
	 * @param longitude
	 * @param latitude
	 * @return
	 */
	@GetMapping("/searchNearby")
	public ResponseEntity<?> searchLocationNearby(@RequestParam(name = "longitude") double longitude,
			@RequestParam(name = "latitude") double latitude) {
		log.debug("通过经纬度获取附近的地点");
		List<Location> results = locationDao.searchLocationNearbyGeographic(longitude, latitude);

		return ResponseEntity.ok(Content.ok(results));
	}

	/**
	 * 添加一个地点
	 * 
	 * @param location
	 * @return
	 */
	@PostMapping("/add")
	public ResponseEntity<?> addLocation(@RequestBody Location location) {
		log.debug("添加一个location");
		log.debug(location.getType() + "...");
		log.debug(location.getType() != null ? location.getType().getType() : "null");
		return ResponseEntity.ok(Content.ok("232442"));
	}

	/**
	 * 通过location 获取footmark
	 * 
	 * @param locationId
	 * @param start
	 * @param size
	 * @return
	 */
	@GetMapping("/footmarks/{locationId}")
	public ResponseEntity<?> footmarks(@PathVariable(name = "locationId") long locationId,
			@MatrixVariable(name = "start") int start, @MatrixVariable(name = "size") int size) {
		log.debug("size:" + size);
		log.debug("start:" + start);
		List<Footmark> result = footmarkDao.listByLocation(locationId, start, size);
		return ResponseEntity.ok(Content.ok(result));
	}

	public LocationDao getLocationDao() {
		return locationDao;
	}

	@Autowired
	public void setLocationDao(LocationDao locationDao) {
		this.locationDao = locationDao;
	}

	public FootmarkDao getFootmarkDao() {
		return footmarkDao;
	}

	@Autowired
	public void setFootmarkDao(FootmarkDao footmarkDao) {
		this.footmarkDao = footmarkDao;
	}
}
