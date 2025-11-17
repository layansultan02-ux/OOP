package edu.zuj.oop;

public class lecture9Test1 {

    String name;
    int salary;

    public lecture9Test1() {
        this.salary = 200;
    }

    public lecture9Test1(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public void printInfo() {
        System.out.println("name = " + name + " , salary = " + salary);
    }
}
