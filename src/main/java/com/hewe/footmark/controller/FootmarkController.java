package com.hewe.footmark.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hewe.footmark.domain.Footmark;

@RestController
@RequestMapping("/footmark")
public class FootmarkController {

	@PostMapping("/add")
	public ResponseEntity<?> addFootmark(@RequestBody Footmark footmark,
			@RequestParam(name = "current_user") String current_user) {
		Footmark db = new Footmark();
		
		return null;
	}
	

}
