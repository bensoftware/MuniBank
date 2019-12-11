package com.userFront.dao;

import org.springframework.data.repository.CrudRepository;

import com.userFront.entities.SavingsAccount;

/*
 * 
 *  @Ben Judicaelle@ Love Coding
 */
public interface SavingsAccountDao extends CrudRepository<SavingsAccount, Long> {

    SavingsAccount findByAccountNumber (int accountNumber);
}
