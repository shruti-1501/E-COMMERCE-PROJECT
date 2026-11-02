package com.example.ecommerce_project.service;

public interface EmailService {

	void sendEmail(
			String to,
			String subject,
			String text
			);
}
