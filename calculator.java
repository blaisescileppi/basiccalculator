import java.util.Scanner;
import java.io.*;

public class calculator {
public static arithmeticOperations output;
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    System.out.println("What operation would you like to calculate?");
    System.out.println("1: Addition \n 2: Subtraction \n 3: Multiplication 4: Division");
    int choice = scan.nextInt();

    System.out.println("Enter two numbers");
    double num1 = scan.nextDouble();
    double num2 = scan.nextDouble();


    if(choice == 1) {
        output.Add(num1, num2);
    } else if (choice == 2) {
        //substraction
    } else if (choice == 3) {
        //multiplication
    } else if (choice == 4) {
        // division
    } else {
        //invalid
    }

// infix to post fix use stack for

}
}