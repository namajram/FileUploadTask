package com.api.service;

import org.springframework.web.multipart.MultipartFile;

import com.api.entity.User;

public interface UserRegisterService {
	

	void register(User user, MultipartFile file)
			throws Throwable;
	String getImage(String email);
}
