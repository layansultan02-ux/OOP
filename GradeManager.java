//e-learning H.w(1)

package edu.zuj.oop;

import java.util.ArrayList;

public class GradeManager {

    private Student[] allStudents;

    public static Student[] createStudents() {
        double[] grades1 = {95.5, 88.0, 92.5};
        double[] grades2 = {70.0, 85.0, 78.0, 81.5};
        double[] grades3 = {65.0, 75.0, 60.0};
        
        Student s1 = new Student("Khalid Ali", 1001, grades1);
        Student s2 = new Student("Sara Emad", 1002, grades2);
        Student s3 = new Student("Ahmad Sami", 1003, grades3);
        
        Student[] students = {s1, s2, s3};
        return students;
    }

    public void showAllStudents(Student[] students) {
        System.out.println("\n===== Listing All Students' Information =====");
        for (Student student : students) {
            student.displayStudentInfo();
            System.out.println("-------------------------");
        }
    }

   public static Student findBestStudent(Student[] students) {
       if (students == null || students.length == 0) {
            return null;
        }

        Student bestStudent = students[0];
        double highestAverage = students[0].getAverage();

        for (int i = 1; i < students.length; i++) {
            if (students[i].getAverage() > highestAverage) {
                highestAverage = students[i].getAverage();
                bestStudent = students[i];
            }
        }
        
       return bestStudent;
    }

   
    public static void main(String[] args) {
        Student[] myStudents = createStudents();
        
        GradeManager manager = new GradeManager();
        
        manager.showAllStudents(myStudents);
        
        Student bestStudent = findBestStudent(myStudents);
        
        System.out.println("\n* Best Student Found *");
        if (bestStudent != null) {
            System.out.println("Best Student Name: " + bestStudent.getStudentName());
            System.out.printf("Highest Average: %.2f\n", bestStudent.getAverage());
        } else {
            System.out.println("No students available to determine the best student.");
        }
    }
}