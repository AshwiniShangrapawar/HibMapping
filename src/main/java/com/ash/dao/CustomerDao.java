package com.ash.dao;

import java.util.Optional;
import com.ash.entity.Loans;
import com.ash.entity.Customer;

public interface CustomerDao {
	
	String saveLoan(Loans loan);

	Optional<Customer> FetchCustomer(Integer custId);

	Loans fetchLoanDetails(Integer loanId);

	void deleteLoan(Integer loanId);

	void deleteCustomer(Integer custId);
	
	

}
