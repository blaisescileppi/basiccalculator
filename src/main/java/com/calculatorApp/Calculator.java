package com.calculatorApp;
//package src.main.java;
import java.util.Scanner;
public class Calculator {
public static ArithmeticOperations output = new ArithmeticOperations();
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int choice;

    do {
        System.out.println("What operation would you like to calculate?");
        System.out.println("1: Addition \n2: Subtraction \n3: Multiplication \n4: Division \n5: System of Equations Solver \n6: Quit");
        choice = scan.nextInt();

        switch (choice){
            case 1:
                System.out.println("Result: " + output.Add(scan));
                break;
            case 2: 
                System.out.println("Result: " + output.Sub(scan));
                break;
            case 3:
                System.out.println("Result: " + output.Mult(scan));
                break;
            case 4: 
                System.out.println("Result: " + output.Div(scan));
                break;
            case 5:
                System.out.println("Result: " + output.systemOfEquations(scan));
                break;
            case 6: 
                System.out.println("Ending program. Goodbye.");
                break;
            default:
                System.out.println("Invalid operation. Please try again.");
                break;
        }
    } while (choice != 5);
        scan.close();
    }
}