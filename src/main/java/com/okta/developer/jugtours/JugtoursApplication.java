package com.okta.developer.jugtours;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


@SpringBootApplication
public class JugtoursApplication {

	public static void main(String[] args) {
		SpringApplication.run(JugtoursApplication.class, args);

//		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mojaBaza");
//		EntityManager entityManager = entityManagerFactory.createEntityManager();
//
//		entityManager.getTransaction().begin();
//		entityManager.persist();
//
//		entityManager.getTransaction().commit();
//		entityManager.close();
//		entityManagerFactory.close();

	}
}

