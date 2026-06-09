package Nsti_Code;

import java.util.Scanner;
class Product{
  private String productCode;
  private String productName;
  private int quantity;
  private double price;
  private double totalPrice;
  Product(String productCode,String productName,double price,int quantity,double totalPrice){
    this.productCode=productCode;
    this.productName=productName;
    this.quantity=quantity;
    this.price=price;
    this.totalPrice=totalPrice;
  }
  public void displayDetails(){
    System.out.printf("%-15s %-15s %-15d %-15.2f %-15.2f\n",this.productCode,this.productName,this.quantity,this.price, this.totalPrice);
  }
}

public class p_11_Product_Details {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter number of Product:");
    int limit=sc.nextInt();
    Product[] products=new Product[limit];
    for (int i=0; i<limit; i++){
      System.out.println("Enter details of product "+(i+1)+": ");
      System.out.print("Enter Product code: ");
      String prCode=sc.next();
      System.out.print("Enter Product name: ");
      String prName=sc.next();
      System.out.print("Enter Product price: ");
      double prPrice=sc.nextInt();
      System.out.print("Enter Product quantity: ");
      int proQuantity=sc.nextInt();
      double totalPrice=prPrice*proQuantity;
      products[i]=new Product(prCode, prName, prPrice,proQuantity, totalPrice);
      System.out.print("\n----------------------------------------------");
    }
    System.out.println("\nProduct Code    Product Name    Prize           Quantity       Total prize");
    for (int i=0; i<limit; i++){
      products[i].displayDetails();
    }
    sc.close();
  }
}
