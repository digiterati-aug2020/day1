package com.digiterati.basics.rest.controller;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
	
	@GetMapping(value="/services/Order",produces="application/json")
	public String getOrderStatus() {
		return JSONObject.quote("success");
	}
	
	@PostMapping(value="/services/Order",produces="application/json",consumes="application/json")
	public String updateOrder(@RequestBody String orderId) {
		return JSONObject.quote(String.format("order id %s success",orderId));
	}

}
