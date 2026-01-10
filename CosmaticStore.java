package edu.zuj.oop;

import java.util.ArrayList;
import java.util.Scanner;

public class CosmaticStore {

    private int serialNum;
    private ArrayList<Musk> muskP;

    public CosmaticStore() {
        serialNum = 123456;
        muskP = new ArrayList<>();
    }

    public CosmaticStore(int serialNum) {
        this.serialNum = serialNum;
    }

    public int getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(int serialNum) {
        if (serialNum >= 123 && serialNum <= 123999) {
            this.serialNum = serialNum;
        } else {
            System.out.println("Invalid Serial Num");
        }
    }

    public ArrayList<Musk> getMuskP() {
        return muskP;
    }

    public void setMuskP(ArrayList<Musk> muskP) {
        this.muskP = muskP;
    }

    public void addMusk() {
        Scanner input = new Scanner(System.in);
        int ID=input.nextInt();
        String Name=input.next();
        double Price=input.nextDouble();
        char s=input.next().charAt(0);
        addMusk(ID, Name, Price, s);
        
    }

    public void addMusk(int id, String name, double price, char s) {
        Musk m = new Musk(id, name, price, s);
        muskP.add(m);
    }

}
