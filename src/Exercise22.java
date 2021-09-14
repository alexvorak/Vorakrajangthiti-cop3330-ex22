
/*
 * UCF COP3330 FALL 2021 Assignment 1 Solution
 * Copyright 2021 Alex Vorakrajangthiti
 */


import java.util.Scanner;

public class Exercise22 {
    public static void main(String[] args) {
        System.out.print("Enter the first number: ");
        Scanner scanner = new Scanner(System.in);
        String num1 = scanner.nextLine();
        int numb1 = Integer.parseInt(num1);
        System.out.print("Enter the second number: ");
        Scanner scanner1 = new Scanner(System.in);
        String num2 = scanner1.nextLine();
        int numb2 = Integer.parseInt(num2);
        System.out.print("Enter the third number: ");
        Scanner scanner3 = new Scanner(System.in);
        String num3 = scanner.nextLine();
        int numb3 = Integer.parseInt(num3);

        if (numb2 > numb3) {
            System.out.println("The largest number is " + numb2 + ".");
        } else if (numb1 > numb2 && numb1 > numb3) {
            System.out.println("The largest number is " + numb1 + "." );
        } else {
            System.out.println("The largest number is " + numb3 + ".");
        }
    }
}
