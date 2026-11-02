package com.example.ecommerce_project.service;

import org.json.JSONObject;

public interface PaymentService {

	JSONObject createOrder(
			Integer amount
			) throws Exception;
	
}
