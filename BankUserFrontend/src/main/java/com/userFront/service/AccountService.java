package com.userFront.service;

import java.security.Principal;

import com.userFront.entities.PrimaryAccount;
import com.userFront.entities.SavingsAccount;

/*
 * 
 *  @Ben Judicaelle@ Love Coding
 */

public interface AccountService {

	PrimaryAccount createPrimaryAccount();
	SavingsAccount createSavingsAccount();
	
	void deposit(String accountType, double amount, Principal principal);
	void withdraw(String accountType, double amount, Principal principal);
}
