package com.tns.inheritance3;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InheritanceTest {
	public static void main(String[] args) {
EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
EntityManager em=factory.createEntityManager();
em.getTransaction().begin();

//create an employee
Employee emp=new Employee();
emp.setName("Min");
emp.setSalary(35000);
em.persist(emp);

//create an employee
Employee emp1=new Employee();
emp1.setName("Moss");
emp1.setSalary(45000);
em.persist(emp1);

//create an Manager
Manager mg=new Manager();
mg.setName("Mark");
mg.setSalary(55000);
mg.setDeptName("Information Technology");
em.persist(mg);

em.getTransaction().commit();
System.out.println("Added employees and Manager successfully");
em.close();
factory.close();
}
}

