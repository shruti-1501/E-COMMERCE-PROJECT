package com.example.ecommerce_project.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.ecommerce_project.service.FileUploadService;



@RestController
@RequestMapping("/api/upload")
public class FileUploadController {

	private final FileUploadService fileUploadService;

	public FileUploadController(FileUploadService fileUploadService) {
		this.fileUploadService = fileUploadService;
	}
	
	
	@PostMapping(consumes = "multipart/form-data")
	public String uploadImage(@RequestParam("file") MultipartFile file) {
		return fileUploadService.uploadImage(file);
	}
}