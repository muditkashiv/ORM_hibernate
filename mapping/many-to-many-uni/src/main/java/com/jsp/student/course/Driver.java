package com.jsp.student.course;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("mudit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Student s = new Student();
		s.setName("Rohan");
		s.setEmail("rooohhhh@gmail.com");
		
		Course c1 = new Course();
		c1.setName("DSA");
		c1.setDuration("6 months");
		
		Course c2 = new Course();
		c2.setName("JAVA");
		c2.setDuration("4 months");
		
		Course c3 = new Course();
		c3.setName("WEBTECH");
		c3.setDuration("3 months");
		
		ArrayList<Course> courses = new ArrayList<Course>();
		courses.add(c1);
		courses.add(c2);
		courses.add(c3);
		
		s.setCourses(courses);
		
		
		entityTransaction.begin();
		entityManager.persist(s);
		entityManager.persist(c1);
		entityManager.persist(c2);
		entityManager.persist(c3);
		entityTransaction.commit();
		
	}

}
