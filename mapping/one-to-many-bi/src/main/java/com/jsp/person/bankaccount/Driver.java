package com.jsp.person.bankaccount;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

//import com.jsp.bank.branches.Branch;

public class Driver {
	public static void main(String[] args) {
EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("mudit");
		
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Person person = new Person();
		person.setName("vedant");
		person.setEmail("ved12@email.com");
		person.setCnos(987674352245l);
		
		BankAccount bankAccount1 = new BankAccount();
		bankAccount1.setBankname("Axis");
		bankAccount1.setIfsccode("AXI3345");
		bankAccount1.setPincode(6789);
		
		BankAccount bankAccount2 = new BankAccount();
		bankAccount2.setBankname("hdfc");
		bankAccount2.setIfsccode("hdfc23345");
		bankAccount2.setPincode(4512);
		
		BankAccount bankAccount3 = new BankAccount();
		bankAccount3.setBankname("pnb");
		bankAccount3.setIfsccode("pnb3345");
		bankAccount3.setPincode(6799);
		
		List<BankAccount> ba=new ArrayList<BankAccount>();
		ba.add(bankAccount1);
		ba.add(bankAccount2);
		ba.add(bankAccount3);
		
		person.setBankAccount(ba);
		
		bankAccount1.setPerson(person);
		bankAccount2.setPerson(person);
		bankAccount3.setPerson(person);
		
		entityTransaction.begin();
		//entityManager.persist(bankAccount1);
		//entityManager.persist(bankAccount2);
		//entityManager.persist(bankAccount3);
		entityManager.persist(person);
		entityTransaction.commit();
		
	}

}
