//e-learning H.w(1)
package edu.zuj.oop;

public class Student {

    private String studentName;
    private int studentId;
    private double[] grades;
    private double average;

    public Student() {
    }

    public Student(String name, int id, double[] gradesArray) {
        this.studentName = name;
        this.studentId = id;
        this.grades = gradesArray;
        this.average = calculateAverage();
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public double[] getGrades() {
        return grades;
    }

    public double getAverage() {
        return average;
    }

    public double calculateAverage() {

        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }

        if (grades.length == 0) {
            return 0.0;
        }
        return sum / grades.length;
    }
    

    public void displayStudentInfo() {

        System.out.println("--- Student Information ---");

        System.out.println("Name: " + studentName);
        System.out.println("ID: " + studentId);

        System.out.print("Grades: ");
        for (double grade : grades) {
            System.out.print(grade + " ");
        }
        System.out.println();

        System.out.printf("Average Grade: %.2f\n", average);
    }
}
