package edu.zuj.oop;

public class Drug {

    private double price;
    private char type;

    public Drug() {
        this.price = 5.0;
        this.type = 'p';
    }

    public Drug(double price, char type) {
        setPrice(price);
        setType(type);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 1 && price <= 60) {
            this.price = price;
        } else {
            this.price = 5.0; // default value if out of range
        }
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        if (type == 'p' || type == 'P' || type == 'd' || type == 'D') {
            this.type = type;
        } else {
            this.type = 'p'; // default value
        }
    }

    public double getDiscount() {
        if (type == 'p' || type == 'P') {
            return price * 0.07;
        } else if (type == 'd' || type == 'D') {
            return price * 0.10;
        }
        return 0;
    }

    public double getTotalPrice() {
        return price - getDiscount();
    }

    @Override
    public String toString() {
        return "Drug{" + "price=" + price + ", type=" + type + ", Discount=" + getDiscount() + ", Total Price=" + getTotalPrice() + '}';
    }

}
