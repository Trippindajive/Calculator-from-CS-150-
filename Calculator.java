import java.util.Scanner;



/**
 *
 *  <h1> Simple Calculator</h1>
 *
 *  The following application is meant to demonstrate methods returning values,
 *  so as a student, you can experience the value of divide - conquer - glue.
 *
 *
 * @author TODO <br>
 *         TODO <br>
 *         Computer Science Department <br>
 *         Colorado State University
 * @version 201990
 */
public class Calculator {
    private static Scanner scanner = new Scanner(System.in);

    private static double add(double num1, double num2) {
        double rtn;
        rtn = num1+num2;
        return rtn; // is there a simpler way to do this? Maybe even keep it one line?
    }

    private static double subtract(double num1, double num2) {
        return 0; // TODO
    }

    private static double multiply(double num1, double num2) {
        return 0; // TODO
    }

    private static double divide(double num1, double num2) {
        return 0; //TODO
    }

    private static void printOptions() {
      
      // TODO
    }

    private static void splashScreen() {
       // TODO
  
    }

    //################## Do not modify below this line ########################

    /**
     * The main driver for the application and the 'divide' and 'glue' (pretty common to be together).
     * Takes in client input from the console, and keeps running until 0 is typed.
     */
    private static void run() {
        printOptions();
        int option = scanner.nextInt();
        if(option == 0) { return; } // leave the recursive loop
        if(option > 4 || option < 0) {
            System.out.println("Invalid option");
        } else {
            System.out.print("\nEnter two numbers, with a space between them. ");
            double num1 = scanner.nextDouble();
            double num2 = scanner.nextDouble();
            double rtnVal = 0;
            if (option == 1) {
                rtnVal = add(num1, num2);   // NOTICE: how we just set the value based on the 'returned value'
            } else if (option == 2) {
                rtnVal = subtract(num1, num2);
            } else if (option == 3) {
                rtnVal = multiply(num1, num2);
            } else if (option == 4) {
                rtnVal = divide(num1, num2);
            }
            System.out.println("Your result is: " + rtnVal);
        }
        run(); // keep calling this method
    }

    public static void main(String[] args) {
        splashScreen();
        run();
    }


}
