package com.example.twoPointAPI.transaction;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//interface for data access with type and id specified.
@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long>{
	
	
	
	
}
