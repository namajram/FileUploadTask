package com.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.api.entity.User;
import com.api.service.impl.UserRegisterServiceImpl;

@RestController
public class UserRegisterController {
	@Autowired
	private UserRegisterServiceImpl userRegisterServiceImpl;

	@PostMapping("/register")
	public ResponseEntity<String> uploadImage(@ModelAttribute User user, @RequestParam("image") MultipartFile file) throws Throwable {
		userRegisterServiceImpl.register(user, file);
		return new ResponseEntity("User registered successfully", HttpStatus.OK);

	}
	
}