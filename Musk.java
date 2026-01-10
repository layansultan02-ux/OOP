package edu.zuj.oop;

public class Musk extends Perfume {

    private int ID;
    private String Name;

    public Musk() {
        ID = 111;
        Name = "White";
    }

    public Musk(int ID, String Name, double Price, char Scent) {
        super(Price, Scent);
        this.ID = ID;
        this.Name = Name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        if (Name.equalsIgnoreCase("White") || Name.equalsIgnoreCase("Black")) {
            this.Name = Name.toUpperCase();
        } else {
            System.out.println("Invalid Name");
        }
    }

    @Override
    public String toString() {
        return "Musk{" + "ID=" + ID + ", Name=" + Name + '}';
    }

    @Override
    public double getTotalPrice() {
        double TotalPrice=0;
        switch(Name){
        case"White":TotalPrice=getPrice()-getExtraDiscount()+10;break;
        case"Black":TotalPrice=getPrice()-getExtraDiscount()+30;break;
        }
        return TotalPrice;
    }

    public String getMuskInfo() {
        return getID()+"**"+getName()+"**"+getScent()+"**"+getPrice()+"**"+getExtraDiscount()+"**"+getTotalPrice();
    }

}
