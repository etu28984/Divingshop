package com.spring.henallux.dataAccess.dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.henallux.dataAccess.entity.UserEntity;
import com.spring.henallux.dataAccess.repository.UserRepository;
import com.spring.henallux.dataAccess.util.Converter;
import com.spring.henallux.model.User;

@Service
@Transactional
public class UserDao {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private Converter converter;
	
	public User saveUser(User user){
		UserEntity userEntity = converter.userModelToUserEntity(user);
		userEntity = userRepository.save(userEntity);
		return converter.userEntityToUserModel(userEntity);
	}
	
	public User findUser(String login){
		UserEntity userEntity = userRepository.findByLogin(login);
		if(userEntity != null)
		{
		return converter.userEntityToUserModel(userEntity);}
		else{return new User();}
	}
	
	public Boolean existLogin(String login){
		UserEntity userEntity = userRepository.findByLogin(login);
		if(userEntity != null)
		{
		return true;}
		else{return false;}
	}
	

}
