package edu.zuj.oop;

public class B extends A {

    @Override
    public void m3() {
        System.out.println("m3 from B");
    }

    public void m4() {
        m3();
        System.out.println("m4 from B");
    }

    public void m5() {
        super.m3();
        System.out.println("m5 from B");
    }

}
