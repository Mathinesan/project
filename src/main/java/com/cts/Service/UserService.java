package com.cts.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.stereotype.Service;

import com.cts.Repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
}