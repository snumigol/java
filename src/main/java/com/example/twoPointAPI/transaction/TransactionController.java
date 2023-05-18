package com.example.twoPointAPI.transaction;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/* mapping for our service.
 * first we instantiate transaction service for transaction controller,
 * then adding mapping for GET and POST request.
 * more services mapping should be added here (PUT, DELETE etc.)
 * */

@RestController
@RequestMapping(path = "api/v1/transaction")
public class TransactionController {

	private final TransactionService transactionService;
	
	@Autowired
	public TransactionController(TransactionService transactionService) {
		this.transactionService = transactionService;
	}
	
	@GetMapping("/all")
	public List<Transaction> getTransactions() {
		return transactionService.getTransactions();
	}
	
	@PostMapping("/add")
	public void newTransaction(@RequestBody Transaction transaction) {
		transactionService.addNewTransaction(transaction);
	}
	
	
	
}
