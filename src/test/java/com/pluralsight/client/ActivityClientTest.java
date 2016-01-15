package com.pluralsight.client;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;

import com.pluralsight.model.Activity;

public class ActivityClientTest {

	@Test
	public void testPut() {
		Activity activity = new Activity();
		activity.setDescription("Swimming");
		activity.setDuration(55);
		
		ActivityClient client = new ActivityClient();
		
		activity = client.update(activity);
		
		assertNotNull(activity);
	}
	
	
	@Test
	public void testCreate() {
		ActivityClient client = new ActivityClient();
		
		Activity activity = new Activity();
		activity.setDescription("Swimming");
		activity.setDuration(55);
		
		activity = client.create(activity);
		
		assertNotNull(activity);		
	}
	
	@Test
	public void testGet() {
		ActivityClient client = new ActivityClient();
		
		Activity activity = client.get("1234");
		
		System.out.println(activity);
		
		assertNotNull(activity);
		
	}
	
	@Test
	public void testGetList() {
		ActivityClient client = new ActivityClient();
		
		List<Activity> activities = client.get();
		
		System.out.println(activities);
		
		assertNotNull(activities);
		
	}
	
	@Test(expected=RuntimeException.class)
	
	public void testGetWithBadRequest() {
		ActivityClient client = new ActivityClient();
		
		client.get("123");
	}
}
