package com.userFront.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.userFront.entities.SavingsTransaction;
/*
 * 
 *  @Ben Judicaelle@ Love Coding
 */
public interface SavingsTransactionDao extends CrudRepository<SavingsTransaction, Long> {

    List<SavingsTransaction> findAll();
}

