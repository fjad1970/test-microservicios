package com.docker.spring.cloud.testMicroservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.RestController;  
import com.docker.spring.cloud.testMicroservice.bean.LimitConfiguration;

@RestController  

public class LimitsConfigurationController {
	@Autowired    
	private Configuration configuration;      
	@GetMapping("/limits")  
	public LimitConfiguration retriveLimitsFromConfigurations()  
	{  
	//getting values from the properties file  
	return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());  
	}  
}
