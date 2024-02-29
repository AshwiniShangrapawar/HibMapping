package com.ash.dao.impl;

import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ash.dao.CustomerDao;
import com.ash.entity.Customer;
import com.ash.entity.Loans;

public class CustomerDaoImpl implements CustomerDao{
	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");


	public String saveLoan(Loans loan) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		String msg = null;

		try {
			// em.persist(loan); this method will try to save customer every time we save
			// loan
			em.merge(loan);
			tx.commit();
			msg = "Loan details saved";
		} catch (Exception e) {
			tx.rollback();
			msg = "Failed To Save the loan details";
			e.printStackTrace();
		} finally {
			em.close();
		}

		return msg;
	}
		

	public Optional<Customer> FetchCustomer(Integer custId) {
		EntityManager em = factory.createEntityManager();
		Customer customer = em.find(Customer.class, custId);
		em.close();
		return Optional.ofNullable(customer);

	}

	public Loans fetchLoanDetails(Integer loanId) {
		EntityManager em = factory.createEntityManager();
		Loans loan = em.find(Loans.class, loanId);
		em.close();
		return loan;
		
		
	}

	public void deleteLoan(Integer loanId) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		Loans loan = em.find(Loans.class, loanId);
		tx.begin();
		try {
			em.remove(loan);
			tx.commit();
			System.out.println("deleted loan with id : " + loanId);
		} catch (Exception e) {
			tx.rollback();
			System.out.println("Failed to delete loan with id : " + loanId);
			e.printStackTrace();
		}
	
		
		
	}

	public void deleteCustomer(Integer custId) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		Customer customer = em.find(Customer.class, custId);
		tx.begin();
		try {
			em.remove(customer);
			System.out.println("deleted Customer with id : " + custId);
		} catch (Exception e) {
			tx.rollback();
			System.out.println("Failed to  deleted Customer with id : " + custId);
			e.printStackTrace();
		}
		
		
	}
	

}
