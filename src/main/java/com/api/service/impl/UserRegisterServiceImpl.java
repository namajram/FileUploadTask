package com.api.service.impl;

import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.api.entity.User;
import com.api.entity.UserRegister;
import com.api.repository.UserRegisterRepository;
import com.api.service.UserRegisterService;

@Service
public class UserRegisterServiceImpl implements UserRegisterService {

	@Autowired
	private UserRegisterRepository userRegisterRepository;

	@Override
	public void register(User user, MultipartFile file) throws Throwable {
		UserRegister userRegister = new UserRegister();
		userRegister.setName(user.getName());
		userRegister.setEmail(user.getEmail());
		userRegister.setPhoneNo(user.getPhoneNo() );
		userRegister.setAddress(user.getAddress());
		userRegister.setGender(user.getGender());
		userRegister.setIdproof(user.getIdproof());

		userRegister.setFileName(file.getOriginalFilename());
		userRegister.setFileType(file.getContentType());
		byte[] bytes = file.getBytes();
		String encodeToString = Base64.getEncoder().encodeToString(bytes);
		userRegister.setImageData(encodeToString);
		userRegisterRepository.save(userRegister);
	}

	@Override
	public String getImage(String email) {
		  UserRegister findByEmail = userRegisterRepository.findByEmail(email);
		if (findByEmail==null) {
			throw new RuntimeException("(Employee Id cannot be find");
			
		}
		return findByEmail.getImageData();
	}
	

	
	

}
