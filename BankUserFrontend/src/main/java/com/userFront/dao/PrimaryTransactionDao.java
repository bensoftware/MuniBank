package com.userFront.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.userFront.entities.PrimaryTransaction;
/*
 * 
 *  @Ben Judicaelle@ Love Coding
 */
public interface PrimaryTransactionDao extends CrudRepository<PrimaryTransaction, Long> {

    List<PrimaryTransaction> findAll();
}
