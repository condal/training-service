package com.condal.demo.cloud.trainingservice.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrainingResource {

	@RequestMapping("/")
	public String getTrainings() {
		return "Training list";
	}

}
