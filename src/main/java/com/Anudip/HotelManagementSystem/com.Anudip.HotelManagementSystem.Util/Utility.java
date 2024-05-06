package com.Anudip.HotelManagementSystem.Util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Utility {
	  private static EntityManagerFactory entityManagerFactory = null;
	  private static EntityManager entityManager = null;


    static {
    	entityManagerFactory = Persistence.createEntityManagerFactory("hotel");
        entityManager = entityManagerFactory.createEntityManager();
    }

    public static EntityManager provideConnection() {
        return entityManager;
    }
}
