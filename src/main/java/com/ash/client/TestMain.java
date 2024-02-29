package com.ash.client;

import java.util.Optional;

import com.ash.dao.CustomerDao;
import com.ash.dao.impl.CustomerDaoImpl;
import com.ash.entity.Customer;
import com.ash.entity.Loans;

public class TestMain {

	public static void main(String[] args) {     //NotFoundException {
		CustomerDao dao = new CustomerDaoImpl();
		
		  // save loan Details
		  
		  /*Customer customer = new Customer();
		  customer.setCustomerId(12345);
		  customer.setCustomerName("Ashwini");
  
		  Loans homeLoan = new Loans();
		  homeLoan.setLoanId(110011);
		  homeLoan.setLoanType("HomeLoan");
		  homeLoan.setCustomer(customer);
		  
		  Loans carLoan = new Loans(); 
		  carLoan.setLoanId(220022);
		  carLoan.setLoanType("CarLoan"); 
		  carLoan.setCustomer(customer);
		  
		  Loans personalLoan = new Loans(); 
		  personalLoan.setLoanId(330033);
		  personalLoan.setLoanType("PersonalLoan"); 
		  personalLoan.setCustomer(customer);
		  
		  dao.saveLoan(homeLoan); 
		  dao.saveLoan(carLoan); 
		  dao.saveLoan(personalLoan);
		  */
		 
		
		
		  // fetch the customer details
		 
//		  Optional<Customer> customerDetails = dao.FetchCustomer(12345);
//		
//		  if (customerDetails.isPresent())
//		  {
//			  Customer customer = customerDetails.get();
//		  System.out.println("CUSTOMER Id : " + customer.getCustomerId());
//		 System.out.println("CUSTOMER NAME : " + customer.getCustomerName()); 
//		 } 
//		  else {
//		 System.err.println("ID NOT FOUND"); }
//		 
//		  // Fetch the loan details
//		 
//		  Loans loanDetails = dao.fetchLoanDetails(220022);
//		  System.out.println("Loan Id : " + loanDetails.getLoanId());
//		  System.out.println("Loan type : " + loanDetails.getLoanType());
//		  System.out.println("Customer Id : " + loanDetails.getCustomer().getCustomerId());
//		 System.out.println("Customer Name : " + loanDetails.getCustomer().getCustomerName());
//		 

		// Delete the loan
		 //dao.deleteLoan(110011);

		// delete the customer
		dao.deleteCustomer(12345); // no action will be taken
}
}

