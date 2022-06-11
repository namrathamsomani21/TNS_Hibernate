package com.cg.client;

import com.cg.entities.Student;
import com.cg.service.StudentService;
import com.cg.service.StudentServiceImpl;

public class Client {
public static void main(String[] args) {
//Debug this program as Debug -> Debug as Java Application

StudentService service = new StudentServiceImpl();
Student student = new Student();

// Create Operation
student.setStudentId(104);
student.setName("Min");
service.addStudent(student);

/*
//at this breakpoint, we have added one record to table
//Retrieve Operation
student = service.findStudentById(100);
System.out.print("Student ID:"+student.getStudentId());
System.out.println("Student Name:"+student.getName());
*/

/*
//Update Operation
student = service.findStudentById(100);
student.setName("Sachin Tendulkar");
service.updateStudent(student);
*/

//at this breakpoint, record is removed from table
//Delete Operation
student = service.findStudentById(100);
service.removeStudent(student);
System.out.println("End of program/Life cycle completed...");
}
}