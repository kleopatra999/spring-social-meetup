package org.springframework.social.meetup.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Rating {
	
	private int average;
	private int count;
	
	public int getAverage() {
		return average;
	}
	public int getCount() {
		return count;
	}
}
