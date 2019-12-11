package com.userFront.dao;

import org.springframework.data.repository.CrudRepository;

import com.userFront.entities.PrimaryAccount;
/*
 * 
 *  @Ben Judicaelle@ Love Coding
 */
public interface PrimaryAccountDao extends CrudRepository<PrimaryAccount,Long> {

    PrimaryAccount findByAccountNumber (int accountNumber);
}
