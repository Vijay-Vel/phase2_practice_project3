package com.app.TDD.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPracticeSearch {
	
	@Test
	public void findpopulation()
	{
		
		String course = "JUnit";
		int ExpectedPractice = 25;
		PracticeSearch ps = new PracticeSearch();
		
		int count = ps.getPractice(course);
		
		System.out.println(count);
		
		Assert.assertEquals(count, ExpectedPractice);
		
	}
	
	@Test
	public void findpracticeEmptyInput()
	{
		try {
		String course = "";
		int ExpectedPractice = 0;
		PracticeSearch ps = new PracticeSearch();
		
		// number of people in the city
		
		int count = ps.getPractice(course);
		}
		
		catch(NullPointerException e)
		{
			System.out.println("Course name cannot be empty");
		}
	}
	
	@Test
	public void findpracticeInvalidInput()
	{
		try {
		String course = "Python";
		int ExpectedPractice = 70;
		PracticeSearch ps = new PracticeSearch();
		
		int count = ps.getPractice(course);
		}
		
		
		catch(NullPointerException e1)
		{
			System.out.println("Course name doesnot exisit in the list");
		}
	}
}
