package com.cg.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil
{
private static EntityManagerFactory factory;
private static EntityManager entityManager;
//has persist,find,merge and remove ops hence it has to be used

static
{
factory = Persistence.createEntityManagerFactory("JPA-PU");
}

public static EntityManager getEntityManager()
{
if(entityManager==null || !entityManager.isOpen()) {
entityManager = factory.createEntityManager();
}
return entityManager;
}
}