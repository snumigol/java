package com.example.twoPointAPI.transaction;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

//services that are mapped in controller.
@Service
public class TransactionService {
	
	private final TransactionRepository transactionRepository;
	
	//injected transaction repo to service
	@Autowired
	public TransactionService(TransactionRepository transactionRepository) {
		this.transactionRepository = transactionRepository;
	}
	
	//get all findings in database
	public List<Transaction> getTransactions() {
		return transactionRepository.findAll();

}
	
	//post one transaction. follow format specified in readme file.
	public void addNewTransaction(@RequestBody Transaction transaction) {
		transactionRepository.save(transaction);
		System.out.println(transaction);
		
	}
}