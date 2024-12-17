import java.util.Scanner;

public class calculator {
public static arithmeticOperations output = new arithmeticOperations();
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int choice;

    do {
        System.out.println("What operation would you like to calculate?");
        System.out.println("1: Addition \n2: Subtraction \n3: Multiplication \n4: Division \n5: Quit");
        choice = scan.nextInt();

        switch (choice){
        }
    }
    } while (choice != 5);
        scan.close();

    }
}
// infix to post fix use stack for
        // if(choice == 1) {
        //     output.Add();
        // } else if (choice == 2) {
        //     output.Sub();
        // } else if (choice == 3) {
        //     output.Mult();
        // } else if (choice == 4) {
        //     output.Div();
        // } else {
        //     System.out.println("Invalid. Please choose a different value.");
