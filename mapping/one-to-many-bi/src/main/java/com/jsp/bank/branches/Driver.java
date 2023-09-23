package com.jsp.bank.branches;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver {
public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("mudit");
		
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Bank bank=new Bank();
		bank.setName("axis");
		
		
		
		Branch branch1=new Branch();
		branch1.setAddress("vashi");
		
		Branch branch2=new Branch();
		branch2.setAddress("Panvel");
		
		Branch branch3=new Branch();
		branch3.setAddress("Panvel");
		
		List<Branch> branchs=new ArrayList<Branch>();
		branchs.add(branch1);
		branchs.add(branch2);
		branchs.add(branch3);
		
		
		bank.setBranches(branchs);
		branch1.setBank(bank);
		branch2.setBank(bank);
		branch3.setBank(bank);
		
		entityTransaction.begin();
		entityManager.persist(bank);
		entityManager.persist(branch1);
		entityManager.persist(branch2);
		entityManager.persist(branch3);
		entityTransaction.commit();
		
		
		
		
		
		
		
		
		
	}
}
