package com.userFront.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.userFront.entities.User;
/*
 * 
 *  @Ben Judicaelle@ Love Coding
 */
public interface UserDao extends CrudRepository<User, Long> {

	User findByUsername(String username);
	User findByEmail(String email);
	List<User> findAll();
}
