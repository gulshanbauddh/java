package practice1;

import java.util.Scanner;

public class FrequencyCount {
  public static void main(String[] args) {
    int limit, count = 0, searchKey;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Array Limit: ");
    limit = sc.nextInt();
    int[] arr = new int[limit];
    for (int i = 0; i < arr.length; i++) {
      System.out.printf("Enter (%d+1) th number %d index element: ", i,i);
      arr[i] = sc.nextInt();
    }
    System.out.print("Enter Search Key: ");
    searchKey = sc.nextInt();

    System.out.println("\n---------------------------------------");
    System.out.print("Array Elements are: [");
    for (int element : arr) {
      System.out.print(element + " ");
    }
    System.out.print("]");
    // Frequency count
    for (int element : arr) {
      if (searchKey == element) {
        count++;
      }
    }
    if (count == 0)
      System.out.printf("\nYour Search Key is %d and frequency count is 0 no element found in this array.", searchKey);
    else
      System.out.printf("\nYour Search Key is %d and frequency count is %d.", searchKey, count);
  }
}







