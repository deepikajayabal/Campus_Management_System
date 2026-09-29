package com.campus.model;

import com.campus.contract.StudentOperation;

public abstract class Student implements StudentOperation{
    //Encapsulation
    //instance variables
    private int studentid;
    private String studentname;
    private int age;
    private String department;
    private int[] marks;

//static variables
static int studentCount=0;

//default constructor
public Student(){
    studentCount++;
}

//parameterized constructor
public Student(int studentid,String studentname,int age,String department,int[] marks){
    this.studentid = studentid;
    this.studentname = studentname;
    this.age = age;
    this.department = department;
    this.marks = marks;
    studentCount++;
}
//getters
public int getstudentid(){
    return studentid;
}
public String getstudentname(){
    return studentname;
}
public int getage(){
    return age;
}
public String getdepartment(){
    return department;
}
public int[] getmarks(){
    return marks;
}
//setters
public void setstudentid(int studentid){
    this.studentid = studentid;
}
public void setstudentname(String studentname){
    this.studentname = studentname;
}
public void setage(int age){
    this.age = age;
}
public void setdepartment(String department){
    this.department = department;
}
public void setmarks(int[] marks){
    this.marks = marks;
}
// instance method - belongs to object

public void displaystudentinfo(){
    System.out.println("studentid:"+studentid);
    System.out.println("studentname:"+studentname);
    System.out.println("age:"+age);
    System.out.println("department:"+department);
}
public void displaystudentinfo(boolean showmarks){
    displaystudentinfo();

    if (showmarks){
        System.out.println("marks: " + java.util.Arrays.toString(marks));
    }
}
public abstract void studentType(); 
//abstract method - no implementation, must be implemented by subclasses
//static methods - belongs to class,not to object
public static void displaystudentCount(){
    System.out.println("total number of student:"+studentCount);
}
}
