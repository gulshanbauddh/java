package practice1;

import java.util.Scanner;

public class FrequencyCount {
  public static void main(String[] args){
    int limit, count;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Array Limit: ");
    limit=sc.nextInt();
    int [] arr=new int[limit];
    for (int i=0;i<arr.length;i++){
      System.out.printf("Enter %d index element: ",i);
      arr[i]=sc.nextInt();
    }
    System.out.print("Array Elements are: ");
    for(int element:arr){
      System.out.print(element+" ");
    }
    // Frequency count
    for (int num1:arr){
    int check=0, store;
    store=num1;
      for (int num2:arr){
        if (num1==num2){
          check++;
        }
      }
      System.out.printf("Frequency of %d is %d",num1, check);
    }
    System.out.println();
  }
}
