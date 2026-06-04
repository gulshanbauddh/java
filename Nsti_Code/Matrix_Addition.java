package Nsti_Code;

import java.util.Scanner;
int[][] matA=new int[m][n];
int[][] matB=new int[m][n];
int[][] matC=new int[m][n];

public class Matrix_Addition {
  public Matrix_Addition() {
    System.out.println("Object Created.");
  }
    public static void main(String[] args){
    int m,n,p,q;
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter row limit of Matrix A: ");
    m=sc.nextInt();
    System.out.print("Enter column limit of Matrix A: ");
    n=sc.nextInt();
    System.out.print("Enter row limit of Matrix B: ");
    p=sc.nextInt();
    System.out.print("Enter column limit of Matrix B: ");
    q=sc.nextInt();
    if ((m == p && n == q)) {
      System.out.println("Matrix Addition possible.");
    } else {
      System.out.print("Matrix Addition not possible.");
    }
  }
}
