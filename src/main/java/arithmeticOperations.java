//package src.main.java;
import java.util.Scanner;
import java.util.regex.*;
import org.apache.commons.math3.linear.*;


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

    public String systemOfEquations(Scanner scan) {
        System.out.println("Enter your three equations in the format Ax+By+Cz=D:");
        scan.nextLine(); // takes leftover endline character, if any
        String eq1 = scan.nextLine();
        String eq2 = scan.nextLine();
        String eq3 = scan.nextLine();
        double A, B, C, D, A2, B2, C2, D2, A3, B3, C3, D3;
    
        Pattern pattern = Pattern.compile("([+-]?\\d*\\.?\\d*)?x\\s*([+-]\\s*\\d*\\.?\\d*)?y\\s*([+-]\\s*\\d*\\.?\\d*)?z\\s*=\\s*([+-]?\\d*\\.?\\d+)");
        
        Matcher matcher = pattern.matcher(eq1);
        if (matcher.find()) {
            A = getCoefficient(matcher.group(1));
            B = getCoefficient(matcher.group(2));
            C = getCoefficient(matcher.group(3));
            D = Double.parseDouble(matcher.group(4));
        } else {
            return "Invalid input for the first equation.";
        }
    
        Matcher matcher2 = pattern.matcher(eq2);
        if (matcher2.find()) {
            A2 = getCoefficient(matcher2.group(1));
            B2 = getCoefficient(matcher2.group(2));
            C2 = getCoefficient(matcher2.group(3));
            D2 = Double.parseDouble(matcher2.group(4));
        } else {
            return "Invalid input for the second equation.";
        }
    
        Matcher matcher3 = pattern.matcher(eq3);
        if (matcher3.find()) {
            A3 = getCoefficient(matcher3.group(1));
            B3 = getCoefficient(matcher3.group(2));
            C3 = getCoefficient(matcher3.group(3));
            D3 = Double.parseDouble(matcher3.group(4));
        } else {
            return "Invalid input for the third equation.";
        }
    
        double[][] coef = {{A, B, C}, {A2, B2, C2}, {A3, B3, C3}};
        double[] constants = {D, D2, D3};
    
        RealMatrix coefficientMatrix = MatrixUtils.createRealMatrix(coef);
        RealVector constantsVector = MatrixUtils.createRealVector(constants);
    
        // Solve the system
        DecompositionSolver solver = new LUDecomposition(coefficientMatrix).getSolver();
        RealVector solution = solver.solve(constantsVector);
    
        return "x = " + solution.getEntry(0) + " y = " + solution.getEntry(1) + " z = " + solution.getEntry(2);
    }
    
    // Helper method to parse the coefficients correctly
    private double getCoefficient(String coeff) {
        if (coeff == null || coeff.isEmpty() || coeff.equals("+")) {
            return 1; // Default to +1
        } else if (coeff.equals("-")) {
            return -1; // Default to -1
        } else {
            return Double.parseDouble(coeff.replace(" ", "")); // Parse as a regular double if it's a valid number
        }
    }
    
     /*
      * public double solveForX(Scanner scan){

      }
      */

}