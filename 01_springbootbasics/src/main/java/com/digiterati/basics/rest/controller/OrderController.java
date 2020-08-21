package com.digiterati.basics.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class OrderController {
	
	private ObjectMapper mapper = new ObjectMapper();
	
	@GetMapping(value="/services/Order",produces="application/json")
	public String getOrderStatus() {
		try {
			return mapper.writeValueAsString("success");
		} catch(JsonProcessingException ex) {
			return "system error while processing";
		}
	}
	
	@PostMapping(value="/services/Order",produces="application/json",consumes="application/json")
	public String updateOrder(@RequestBody String orderId) {
		try {
			return mapper.writeValueAsString(String.format("order id %s success!",orderId));
		} catch(JsonProcessingException ex) {
			return "system error while processing";
		}
	}

}
