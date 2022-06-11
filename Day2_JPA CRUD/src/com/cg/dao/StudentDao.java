package com.cg.dao;

import com.cg.entities.Student;

public interface StudentDao {
public abstract Student getStudentById(int id);//Retrieve
public abstract void addStudent(Student student);//Create
public abstract void updateStudent(Student student);//merge
public abstract void removeStudent(Student student);//Delete


public abstract void beginTransaction();//to start the connection
public abstract void commitTransaction();//to end the connection

}