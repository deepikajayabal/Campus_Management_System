package com.campus.app;

import java.util.Scanner;
import com.campus.model.Student;
import com.campus.service.StudentService;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the student id");
        int studentid=sc.nextInt();
        sc.nextLine(); // consume the newline character
        System.out.println("enter the student name");
        String studentname=sc.nextLine();
        System.out.println("enter the student age");
        int age=sc.nextInt();
        sc.nextLine(); // consume the newline character
        System.out.println("enter the student department");
        String department=sc.nextLine();
        System.out.println("number of subject");
        int n=sc.nextInt();
        sc.nextLine(); // consume the newline character
        int[] marks=new int[n];
        System.out.println("enter the marks for"+ n +" subject");
        for(int i=0;i<n;i++){
            System.out.println("enter the marks for subject +(i+i)");
            marks[i]=sc.nextInt();
            sc.nextLine();
            }
            System.out.println("enter the scholarship percentage");
            double scholarshipPercentage=sc.nextDouble();
            sc.nextLine(); 
            Student student=new ScholarshipStudent(studentid,studentname,age,department,marks);
            student.displaystudentinfo(true);
            Student.displaystudentCount();
            StudentService studentService = new StudentService();
            studentService.displayReportCard(student);
            sc.close();
            }
        }
