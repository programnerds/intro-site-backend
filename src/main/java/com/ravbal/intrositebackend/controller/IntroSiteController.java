package com.ravbal.intrositebackend.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ravbal.intrositebackend.request.StoreRequest;
import com.ravbal.intrositebackend.response.StoreRequestResponse;

@RestController
@RequestMapping("/ravbal/api/v1")
public class IntroSiteController {
	
    @PostMapping(path= "/storeRequest", consumes = "application/json", produces = "application/json")
	public StoreRequestResponse storeRequest(@RequestBody StoreRequest request){
		StoreRequestResponse response = new StoreRequestResponse();
		return response;
	}

}
