package com.jsp.person.pan;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSavePersonPanBi {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("mudit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Person person = new Person();
		person.setName("mudit");
		person.setEmail("mudit@gmail.com");
		person.setCno(976345678997l);
	
	    Pan pan = new Pan();
	    pan.setAddress("Indore");
	    pan.setPersonid(person);
	    person.setPan(pan);
	    entityTransaction.begin();
	    entityManager.persist(person);
	    entityManager.persist(pan);
	    entityTransaction.commit();
		
	}

}
