package com.userFront.service;

import java.security.Principal;
import java.util.List;

import com.userFront.entities.PrimaryAccount;
import com.userFront.entities.PrimaryTransaction;
import com.userFront.entities.Recipient;
import com.userFront.entities.SavingsAccount;
import com.userFront.entities.SavingsTransaction;
/*
 * 
 *  @Ben Judicaelle@ Love Coding
 */

public interface TransactionService {
	List<PrimaryTransaction> findPrimaryTransactionList(String username);

	List<SavingsTransaction> findSavingsTransactionList(String username);

	void savePrimaryDepositTransaction(PrimaryTransaction primaryTransaction);

	void saveSavingsDepositTransaction(SavingsTransaction savingsTransaction);

	void savePrimaryWithdrawTransaction(PrimaryTransaction primaryTransaction);

	void saveSavingsWithdrawTransaction(SavingsTransaction savingsTransaction);

	void betweenAccountsTransfer(String transferFrom, String transferTo, String amount, PrimaryAccount primaryAccount,
			SavingsAccount savingsAccount) throws Exception;

	List<Recipient> findRecipientList(Principal principal);

	Recipient saveRecipient(Recipient recipient);

	Recipient findRecipientByName(String recipientName);

	void deleteRecipientByName(String recipientName);
	
	void toSomeoneElseTransfer(Recipient recipient, String accountType, String amount, PrimaryAccount primaryAccount, SavingsAccount savingsAccount);
	

}
