package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import com.pluralsight.model.Activity;
import com.pluralsight.model.User;

public class ActivityRepositoryStub implements ActivityRepository {
	
	@Override
	public void create(Activity activity) {

		//Should issue a Insert statement to the db
	}
	
	@Override
	public List<Activity> findAllActivities() {
		List<Activity> activities = new ArrayList<Activity>();
		
		Activity activity1 = new Activity();
		
		activity1.setDescription("Swimming");
		activity1.setDuration(55);
		
		activities.add(activity1);
		
		Activity activity2 = new Activity();
		
		activity2.setDescription("Cycling");
		activity2.setDuration(120);
		
		activities.add(activity2);
		
		return activities;
		
	}
	
	@Override
	public Activity findActivity(String activityId) {
	
		Activity activity = new Activity();
		
		activity.setDescription("Swimming");
		activity.setDuration(55);
		activity.setId("1234");
		
		User user = new User();
		user.setId("5678");
		user.setName("Vicky");
		
		activity.setUser(user);
		
		return activity;
	}

}
