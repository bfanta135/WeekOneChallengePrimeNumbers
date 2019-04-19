package com.company;



import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int a = 0;
        int num= 0;

      String primeNumber = "";


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number");

        int number = scan.nextInt();
        scan.close();
          for (a=1; a <= number; a++);
        {
            int counter = 0;
            for (number=a; num >= 1; num--)
            {
                if (a % num==0)
            {
                counter = counter + 1;
            }
        }
              if (counter ==2) {
                  System.out.print("%d is a primeNumber\r\n");
              }  else {
                System.out.print("%d is not a primeNumber\r\n");
              }

              }
        }

    }