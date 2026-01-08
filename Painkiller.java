package edu.zuj.oop;

public class Painkiller extends Drug {

    private int id;
    private String name;

    public Painkiller() {
        super(5.0, 'p');
        this.id = 1;
        this.name = "Panda";
    }

    public Painkiller(int id, String name, double price, char type) {
        super(price, type);
        this.id = id;
        setName(name);
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        if (name.equalsIgnoreCase("Panda") || name.equalsIgnoreCase("Voltaren")) {
            this.name = name;
        } else {
            this.name = "Panda"; // default value
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public double getTotalPrice() {
        if (name.equalsIgnoreCase("Panda")) {
            return (getPrice() - getDiscount()) + 1.5;
        } else if (name.equalsIgnoreCase("Voltaren")) {
            return (getPrice() - getDiscount()) + 2.0;
        }
        return super.getTotalPrice();
    }

    public String getPainkillerInfo() {
        return id + "\t" + name + "\t" + getType() + "\t" + getPrice()
                + "\t" + String.format("%.2f", getDiscount())
                + "\t" + String.format("%.2f", getTotalPrice());
    }
}
