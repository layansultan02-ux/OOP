package edu.zuj.oop;

public class Perfume {

    private double Price;
    private char Scent;

    public Perfume() {
        Price = 20;
        Scent = 'O';
    }

    public Perfume(double Price, char Scent) {
        this.Price = Price;
        this.Scent = Scent;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        if (Price >= 20 && Price <= 180) {
            this.Price = Price;
        } else {
            System.out.println("Invalid Price");
        }
    }

    public char getScent() {
        return Scent;
    }

    public void setScent(char Scent) {
        if (Scent == 'O' || Scent == 'F' || Scent == 'W' || Scent == 'T') {
            this.Scent = Scent;
        } else {
            System.out.println("Invalid Scent");
        }
    }

    @Override
    public String toString() {
        return "Perfume{" + "Price=" + Price + ", Scent=" + Scent + '}';
    }

    public double getExtraDiscount() {
        double discount = 0;
        switch (Scent) {
            case 'O': discount = Price * 5 / 100;break;
            case 'F': discount = Price * 10 / 100;break;
            case 'W': discount = Price * 15 / 100;break;
            case 'T': discount = Price * 20 / 100;break;
        }
        return discount;
    }

    public double getTotalPrice() {
        double total=Price-getExtraDiscount();
        return total;
    }
}
