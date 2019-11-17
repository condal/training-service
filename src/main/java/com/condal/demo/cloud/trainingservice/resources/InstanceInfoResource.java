package com.condal.demo.cloud.trainingservice.resources;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InstanceInfoResource {

	@Value("${service.instance.name}")
	private String instance;

	@RequestMapping
	public String getInstanceInfo() {
		return "Instance:  " + instance;
	}

}
