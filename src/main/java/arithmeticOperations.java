//package src.main.java;
import java.util.Scanner;
import java.util.regex.*;
import org.apache.commons.math3.linear.*;


// import Jama.Matrix;

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


    public double systemOfEquations(Scanner scan) {
        System.out.println("Enter your three equations in the format Ax+By+Cz=D:");
        scan.nextLine(); // takes leftover endline character, if any
        String eq1 = scan.nextLine();
        String eq2 = scan.nextLine();
        String eq3 = scan.nextLine();
        double A, B, C, D, A2, B2, C2, D2, A3, B3, C3, D3;

        Pattern pattern = Pattern.compile("([+-]?\\d*\\.?\\d+)x\\s*([+-]\\s*\\d*\\.?\\d+)y\\s*([+-]\\s*\\d*\\.?\\d+)z\\s*=\\s*([+-]?\\d*\\.?\\d+)");
        Matcher matcher = pattern.matcher(eq1);
        if (matcher.find()) {
            A = Double.parseDouble(matcher.group(1));
            B = Double.parseDouble(matcher.group(2));
            C = Double.parseDouble(matcher.group(3));
            D = Double.parseDouble(matcher.group(4));
        } else {
            System.out.println("Invalid input for the first equation.");
            return 0;
        }
    
        Matcher matcher2 = pattern.matcher(eq2);
        if (matcher2.find()) {
            A2 = Double.parseDouble(matcher2.group(1));
            B2 = Double.parseDouble(matcher2.group(2));
            C2 = Double.parseDouble(matcher2.group(3));
            D2 = Double.parseDouble(matcher2.group(4));
        } else {
            System.out.println("Invalid input for the second equation.");
            return 0;
        }
    
        Matcher matcher3 = pattern.matcher(eq3);
        if (matcher3.find()) {
            A3 = Double.parseDouble(matcher3.group(1));
            B3 = Double.parseDouble(matcher3.group(2));
            C3 = Double.parseDouble(matcher3.group(3));
            D3 = Double.parseDouble(matcher3.group(4));
        } else {
            System.out.println("Invalid input for the third equation.");
            return 0;
        }
    

        double[][] coef = {{A, B, C}, {A2, B2, C2}, {A3, B3, C3}};
        double[] constants = {D, D2, D3};

        RealMatrix coefficientMatrix = MatrixUtils.createRealMatrix(coef);
        RealVector constantsVector = MatrixUtils.createRealVector(constants);

        // Solve the system
        DecompositionSolver solver = new LUDecomposition(coefficientMatrix).getSolver();
        RealVector solution = solver.solve(constantsVector);
        
        // Print solution
        System.out.println("x = " + solution.getEntry(0));
        System.out.println("y = " + solution.getEntry(1));
        System.out.println("z = " + solution.getEntry(2));
        


        return 0;
     }


     /*
      * public double solveForX(Scanner scan){

      }
      */

}