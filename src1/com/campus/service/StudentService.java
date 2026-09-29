package com.campus.service;

import com.campus.model.Student;

public class StudentService {
    //calculate total marks

    public int calculateTotal(int[] marks) {
        if (marks == null) {
            return 0;
        }
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    //calculate average marks
    public double calculateAverage(int[] marks) {
        if (marks == null || marks.length == 0) {
            return 0.0;
        }
        int total = calculateTotal(marks);
        return (double) total / marks.length;
    }

    //find maximum marks
    public int findMax(int[] marks) {
        if (marks == null || marks.length == 0) {
            return 0;
        }

        int max = marks[0];

        for (int mark : marks) {
            if (mark > max) {
                max = mark;
            }
        }

        return max;
    }

    //find minimum marks
    public int findMin(int[] marks) {
        if (marks == null || marks.length == 0) {
            return 0;
        }

        int min = marks[0];

        for (int mark : marks) {
            if (mark < min) {
                min = mark;
            }
        }

        return min;
    }
    //grade based on marks
public char grade(Student student) {
    int[] marks = student.getmarks();

    if (marks == null || marks.length == 0) {
        return 'F';
    }

    int average = (int) calculateAverage(marks);

    if (average >= 90) {
        return 'A';
    } else if (average >= 80) {
        return 'B';
    } else if (average >= 70) {
        return 'C';
    } else if (average >= 60) {
        return 'D';
    } else {
        return 'F';
    }
}
//pass or fail
public String passOrFail(Student student) {
    int[] marks = student.getmarks();

    if (marks == null || marks.length == 0) {
        return "Fail";
    }

    int average = (int) calculateAverage(marks);

    if (average >= 40) {
        return "Pass";
    } else {
        return "Fail";
    }
}
// display report card
public void displayReportCard(Student student) {

    int[] marks = student.getmarks();

    System.out.println("Student Name: " + student.getstudentname());
    System.out.println("Student ID: " + student.getstudentid());
    System.out.println("Department: " + student.getdepartment());

    System.out.println("Total Marks: " + calculateTotal(marks));
    System.out.println("Average Marks: " + calculateAverage(marks));
    System.out.println("Maximum Marks: " + findMax(marks));
    System.out.println("Minimum Marks: " + findMin(marks));
    System.out.println("Grade: " + grade(student));
    System.out.println("Pass/Fail: " + passOrFail(student));
}
}