package com.hewe.location.domain;

import com.fasterxml.jackson.annotation.JsonValue;

public enum LocationType {
	SCHOOL("school"), //
	HOTEL("hotel"),//
	;

	private final String type;

	LocationType(String type) {
		this.type = type;
	}

	@JsonValue
	public String getType() {
		return type;
	}
}
