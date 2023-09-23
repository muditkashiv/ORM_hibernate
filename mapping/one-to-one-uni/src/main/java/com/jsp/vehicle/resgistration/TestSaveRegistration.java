package com.jsp.vehicle.resgistration;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveRegistration {
	public static void main(String[] args) {
		EntityManagerFactory  entityManagerFactory = Persistence.createEntityManagerFactory("mudit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Vehicle vehicle  = new Vehicle();
		vehicle.setBrand("HONDA");
		vehicle.setName("honda city");
		vehicle.setPrice(5000000.99);
		vehicle.setColour("black");
		
		Resgistration resgistration = new Resgistration();
		resgistration.setRegistrationNo("123AA#56");
		resgistration.setCity("ahmedabad");
		resgistration.setVehicle(vehicle);
		
		entityTransaction.begin();
		entityManager.persist(vehicle);
		entityManager.persist(resgistration);
		entityTransaction.commit();
		
	}

}
