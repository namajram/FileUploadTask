package com.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.entity.UserRegister;

@Repository
public interface UserRegisterRepository extends JpaRepository<UserRegister, Long> {
	UserRegister findByEmail(String email);

	
}
