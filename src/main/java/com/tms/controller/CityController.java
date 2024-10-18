package com.tms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tms.model.CityDetails;
import com.tms.model.TMSResponse;
import com.tms.service.CityService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/city")
public class CityController {
	
	@Autowired
	CityService cityService;
	
	@PostMapping("/save-city-details")
	public TMSResponse saveCityDetails(  @RequestBody  CityDetails cityDetails) {
		return cityService.saveCityDetails(cityDetails);
	}

}
