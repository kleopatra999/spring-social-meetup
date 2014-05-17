package org.springframework.social.meetup.api.impl;

import java.util.List;

import org.springframework.social.meetup.api.Event;
import org.springframework.social.meetup.api.EventOperations;
import org.springframework.social.meetup.api.EventResults;
import org.springframework.web.client.RestTemplate;

public class EventTemplate extends AbstractMeetupOperations implements 
			EventOperations {

	private final RestTemplate restTemplate;
	
	public EventTemplate(RestTemplate restTemplate, boolean authorized) {
		super(authorized);
		this.restTemplate = restTemplate;
	}
	
	@Override
	public List<Event> getSelfEvents() {
		
		EventResults eventlist = restTemplate.getForObject(buildUri(EVENTS_URL, "member_id", "self"), EventResults.class);
		List<Event> events = eventlist.getResults();
		return events;
	}
		
	//URL Constants
	public static final String EVENTS_URL = "events";
}
