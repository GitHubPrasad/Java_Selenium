package com.TestNG.FirstFramework;

import org.testng.annotations.Test;

//Priority = Lowest number will get highest priority
//If test is not given any priority then it is going to run First

public class AnnotationsPractice 
{
	@Test(invocationCount = 2, priority = 4, groups = {"Sanity"})
	public void test1() 
	{
		System.out.println("Test 1");
	}
	
	@Test(priority = 1, groups = {"Sanity", "Regression"})
	public void test2() 
	{
		System.out.println("Test 2");
	}
	
	@Test(priority = 3, groups = {"Regression"})
	public void test3() 
	{
		System.out.println("Test 3");
	}
	
	@Test(priority = 4)
	public void test4() 
	{
		System.out.println("Test 4");
	}
	
	@Test(enabled = false)
	public void test5() 
	{
		System.out.println("Test 5");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
