import java.util.InputMismatchException;
import java.util.Scanner;

public class arithmeticOperations {    
// public double ans;
public static arithmeticOperations output;


    static void intro() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Would you like to continue?");
        System.out.println("1: Addition \n 2: Subtraction \n 3: Multiplication \n 4: Division \n 5: Quit");
        int choice = scan.nextInt();
        
        if(choice == 1) {
            output.Add();
        } else if (choice == 2) {
            output.Sub();
        } else if (choice == 3) {
            output.Mult();
        } else if (choice == 4) {
            output.Div();
        } else {
            System.out.println("Invalid. Please choose a different value.");
        }
    scan.close();
    }

    public double Add() {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter two numbers");
            double num1 = scan.nextDouble();
            double num2 = scan.nextDouble();

            return num1 + num2;
            // intro();
        }
    }

    public double Sub() {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter two numbers");
            double num1 = scan.nextDouble();
            double num2 = scan.nextDouble();

            return num1 - num2;
        }
    }

    public double Mult() {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter two numbers");
            double num1 = scan.nextDouble();
            double num2 = scan.nextDouble();

            return num1 * num2;
        }
    }

    public double Div() {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter two numbers");
            double num1 = scan.nextDouble();
            double num2 = scan.nextDouble();

            return num1/num2;
        }
    }
}

