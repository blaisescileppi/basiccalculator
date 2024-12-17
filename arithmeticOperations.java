import java.util.Scanner;

public class arithmeticOperations {

    public double Add(Scanner scan) {
        System.out.println("Enter two numbers");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        return num1 + num2;
    }

    public double Sub(Scanner scan) {
        System.out.println("Enter two numbers");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        return num1 - num2;
    }


    public double Mult(Scanner scan) {
        System.out.println("Enter two numbers");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        return num1 * num2;
    }


    public double Div(Scanner scan) {
        System.out.println("Enter two numbers");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        if (num2 == 0) {
            System.out.println("Invalid. No division by zero.");
            return 0;
        }
        return num1/num2;
    }

}

