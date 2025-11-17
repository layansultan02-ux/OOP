package edu.zuj.oop;

public class lecture9Test2 {

    public static void main(String[] args) {
        lecture9Test1 e1 = new lecture9Test1("Ata", 1000);
        e1.printInfo();

        lecture9Test1 e2 = new lecture9Test1("Essa", 500);
        e2.printInfo();

        lecture9Test1 e3 = new lecture9Test1();
        e3.name = "Ata";
        e3.printInfo();
    }

}
