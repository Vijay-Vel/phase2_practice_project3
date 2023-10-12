package com.app.TDD.demo;

import java.util.HashMap;
import java.util.Map;

public class PracticeSearch {
	
private Map<String, Integer> getpracticedata() {
		
		Map<String, Integer> courseMap = new HashMap<>();
		courseMap.put("TestNG", 15);
		courseMap.put("JUnit", 25);
		courseMap.put("Jenkins", 20);
		courseMap.put("TDD", 50);
		

		return courseMap;
	}
	
	public int getPractice(String course) {
		
		Map<String, Integer> courseMap = null ;
		int count =0;
		
		if(course.isEmpty())
		{
			throw new NullPointerException("Course name cannot be empty");
		}
		courseMap = getpracticedata();
	
		if(!courseMap.containsKey(course))
		{
			throw new NullPointerException("Course name doesnot exist");
		}
		else {
		count = courseMap.get(course);
		}
		return count;
		
	}
}
