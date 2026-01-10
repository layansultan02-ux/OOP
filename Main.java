
package edu.zuj.oop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CosmaticStore c1=new CosmaticStore();
        CosmaticStore c2=new CosmaticStore();
        fill(c1);
        fill(c2);
        search(c1);
        search(c2);
    }
  public static void fill(CosmaticStore c){
      Scanner input = new Scanner(System.in);
      c.setSerialNum(input.nextInt());
      for(int i=0;i<2;i++){
      c.addMusk();
      }
  }
  public static void search(CosmaticStore c){
  Scanner input = new Scanner(System.in);
  int Price = input.nextInt();
  for(int i=0;i<c.getMuskP().size();i++){
  Musk m = c.getMuskP().get(i);
  if(m.getTotalPrice()<=Price){
      System.out.println(m);
  }
  }
   
  }
}
