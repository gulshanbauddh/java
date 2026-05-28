package practice1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class addTwoNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b,c,d;
        System.out.print("Enter Two number.\nEnter First Number");
        a=sc.nextInt();
        System.out.print("Enter Second Number");
        b=sc.nextInt();
        c=a+b;
        System.out.printf("a=%d and b=%d and Sum of a+b=%d",a,b,c);
//        System.out.println(a+"+"+b+"="+c);
    }
}
