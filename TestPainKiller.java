package edu.zuj.oop;

import java.util.Scanner;

public class TestPainKiller {

    public static void main(String[] args) {
        Painkiller[] list = new Painkiller[3];
        DataFill(list);
        DataPrint(list);
    }

    public static void DataFill(Painkiller[] array) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter ID, Name (Panda/Voltaren), Price, and Type (p/d) for Painkiller " + (i + 1) + ":");
            int id = input.nextInt();
            String name = input.next();
            double price = input.nextDouble();
            char type = input.next().charAt(0);
            array[i] = new Painkiller(id, name, price, type);
        }
    }

    public static void DataPrint(Painkiller[] array) {
        System.out.println("\nid\tname\ttype\tprice\tdiscount\ttotal price");
        for (Painkiller pk : array) {
            if (pk.getName().equalsIgnoreCase("Panda") && pk.getTotalPrice() > 20) {
                System.out.println(pk.getPainkillerInfo());
            }
        }
    }
}
