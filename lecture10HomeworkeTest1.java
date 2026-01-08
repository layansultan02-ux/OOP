package edu.zuj.oop;

public class lecture10HomeworkeTest1 {

   private String name;
   private int age;

    public lecture10HomeworkeTest1() {
    }

    public lecture10HomeworkeTest1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if(age >1){
        this.age = age;
        }else{
            System.out.println("Invalid Input");
        }
    }

    @Override
    public String toString() {
        return "lecture10HomeworkeTest1{" + "name=" + name + ", age=" + age + '}';
    }

    public void talk() {

    }
}
