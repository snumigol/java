package com.example.twoPointAPI.transaction;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

//map transaction to database
@Entity
@Table
public class Transaction {

	//table sequence
	@Id
	@SequenceGenerator(
			name = "transaction_sequence",
			sequenceName = "transaction_sequence",
			allocationSize = 1)
	
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "transaction_sequence")
	
	private Long transactionId;
	private Long userId;
	private String product;
	private Double amount;
	
	
	//constructors for transaction.
	public Transaction() {
		
	}

	
	public Transaction(Long transactionId,
					Long userId,
					String product,
					Double amount) {
		super();
		this.transactionId = transactionId;
		this.userId = userId;
		this.product = product;
		this.amount = amount;
	}

	//here skipped transactionId. Database will add it.
	public Transaction(Long userId,
					String product,
					Double amount) {
		super();
		this.userId = userId;
		this.product = product;
		this.amount = amount;
	}

	//getters and setters
	public Long getTransactionId() {
		return transactionId;
	}


	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}


	public Long getUserId() {
		return userId;
	}


	public void setUserId(Long userId) {
		this.userId = userId;
	}


	public String getProduct() {
		return product;
	}


	public void setProduct(String product) {
		this.product = product;
	}


	public Double getAmount() {
		return amount;
	}


	public void setAmount(Double amount) {
		this.amount = amount;
	}

	
	//to string override
	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + 
				", userId=" + userId + 
				", product=" + product +
				", amount=" + amount + "]";
	}
	
	
	
}
