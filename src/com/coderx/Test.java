package com.coderx;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in); //scanner class to get inputs from the user
//        System.out.println("Testing inputs");
//        System.out.print("Enter Number: ");
//        int a = scanner.nextInt();
//        System.out.println(a);
//        scanner.nextLine(); // here we must add nextLine(), otherwise we cannot take name input from the user
//        System.out.print("Enter Name: ");
//        String name = scanner.nextLine(); // if we use nextLine() here, it will take the to nextLine, but the next takes
//                                        // only one word from the input
//        System.out.println(name);
       // scanner.next();

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Testing String Inputs");
//        System.out.print("Enter Name: ");
//        String name = scanner.nextLine();
//        System.out.println(name);
//        System.out.print("Enter Town: ");
//        String town = scanner.nextLine();
//        System.out.println(town);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Testing Int Inputs");
        System.out.print("Enter Number 1: ");
        int number1 = scanner.nextInt();
        System.out.println(number1);
        System.out.println("Enter Number 2: ");
        int number2 = scanner.nextInt();
        System.out.println(number2);
    }
}
