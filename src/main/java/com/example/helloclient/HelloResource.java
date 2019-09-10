package com.example.helloclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController

public class HelloResource {

	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/rest/hello/client/affordablehealthcare")
	@GetMapping
	public String affordablehealthcare() {
		
		String url = "http://hello-server/rest/hello/server/affordablehealthcare";
		return restTemplate.getForObject(url, String.class);
	}
	
	@RequestMapping("/rest/hello/client/childeducation")
	@GetMapping
	public String childeducation() {
		
		String url = "http://hello-server/rest/hello/server/childeducation";
		return restTemplate.getForObject(url, String.class);
	}
	
}
