package com.jsp.person.account;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSavePersonAccount {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("mudit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Person person = new Person();
		
		Account account1 = new Account();
		account1.setBank_name("SBI");
		account1.setAccount_no(566678889990l);
		account1.setIfsc_code("SBI789000");
		
		
		Account account2 =  new Account();
		account2.setBank_name("IOB");
		account2.setAccount_no(456777777770l);
		account2.setIfsc_code("IOB677889953");
		
		Account account3 = new Account();
		account3.setBank_name("PNB");
	    account3.setAccount_no(987555444333l); 
	    account3.setIfsc_code("PNB6667774322");
	    
	    account1.setPerson(person);
	    account2.setPerson(person);
	    account3.setPerson(person);
	    entityTransaction.begin();
	    entityManager.persist(person);
	    entityManager.persist(account1);
	    entityManager.persist(account2);
	    entityManager.persist(account3);
	    entityTransaction.commit();
	    
	    
	}

}
