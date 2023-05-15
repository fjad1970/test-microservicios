package com.docker.spring.cloud.testMicroservice.bean;

public class LimitConfiguration {
	private int maximum;  
	private int minimum;  
	//no-argument constructor  
	protected LimitConfiguration()  
	{  
	}  
	//generating getters  
	public int getMaximum()   
	{  
	return maximum;  
	}  
	public int getMinimum()   
	{  
	return minimum;  
	}  
	//generating constructor using fields  
	public LimitConfiguration(int maximum, int minimum)   
	{  
	super();  
	this.maximum = maximum;  
	this.minimum = minimum;  
	}  
}
