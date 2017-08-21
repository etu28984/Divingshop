package com.spring.henallux.dataAccess.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.henallux.dataAccess.entity.UserEntity;

@Repository
@Transactional
public interface UserRepository extends JpaRepository<UserEntity, String>{
	
	public UserEntity findByLogin(String login);
	
}
