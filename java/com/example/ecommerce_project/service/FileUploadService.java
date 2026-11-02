package com.example.ecommerce_project.service;

import org.springframework.web.multipart.MultipartFile;

public interface FileUploadService {

	String uploadImage(MultipartFile file);
}