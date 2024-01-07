package corejava;

import java.util.Scanner;

/*
 * @author Mehedi
 */
public class CoreJava {

    public static void main(String[] args) {

        /*Calling method add Two Number 
        addTwoNumber();
        
        Calling method log In
        logIn();
        
        Calling method greater Among Three Numbers
        greaterAmongThreeNumbers();
        
        Calling method Number Table
        numberTable();
        
        Calling method odd or even 
        oddOrEven();
        
        Calling method calculator 
        calculator();*/
    }

    public static void addTwoNumber() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any two integer numbers:");
        int numberOne = input.nextInt();
        int numberTwo = input.nextInt();
        int sumOfTwoNumber = numberOne + numberTwo;
        System.out.println("Sum of two numbers: " + sumOfTwoNumber);
    }

    public static void logIn() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter username: ");
        String userName = input.next();
        System.out.println("Enter password: ");
        String password = input.next();

        if (userName.equals("mehediJavaDeveloper") && password.equals("IamBackendDeveloper2024")) {
            System.out.println("Log in successful");
        } else if (userName.equals("mehediJavaDeveloper")) {
            System.out.println("Invalid password");
        } else if (password.equals("IamBackendDeveloper2024")) {
            System.out.println("Invalid username");
        } else {
            System.out.println("Please sign up. Username & password are not recognized");
        }
    }

    public static void greaterAmongThreeNumbers() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any three integer numbers:");
        int numberOne = input.nextInt();
        int numberTwo = input.nextInt();
        int numberThree = input.nextInt();

        if (numberOne > numberTwo) {
            if (numberOne > numberThree) {
                System.out.println("Largest number: " + numberOne);
            } else {
                System.out.println("Largest number: " + numberThree);
            }
        } else {
            if (numberTwo > numberThree) {
                System.out.println("Largest number: " + numberTwo);
            } else {
                System.out.println("Largest number: " + numberThree);
            }
        }

    }

    public static void numberTable() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any integer number:");
        int inputNumber = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            int total = i * inputNumber;
            System.out.println(inputNumber + " * " + i + " = " + total);
        }
    }

    public static void oddOrEven() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any integer number: ");
        int inputNumber = input.nextInt();
        while (inputNumber > 0) {
            if (inputNumber % 2 == 0) {
                System.out.println(inputNumber + " is a even number");
                break;
            } else {
                System.out.println(inputNumber + " is a odd number");
                break;
            }
        }

    }

    public static void calculator() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any two integer numbers:");
        int numberOne = input.nextInt();
        int numberTwo = input.nextInt();
        int result;
        System.out.println("Enter your choice: Addition / Subtraction / Multiplication / Division / Remainder");
        String action = input.next().toLowerCase();

        switch (action) {

            case ("addition"):
                result = numberOne + numberTwo;
                System.out.println("Addition: " + result);
                break;
            case ("subtraction"):
                result = numberOne - numberTwo;
                System.out.println("Subtraction: " + result);
                break;
            case ("multiplication"):
                result = numberOne * numberTwo;
                System.out.println("Multiplication: " + result);
                break;
            case ("division"):
                result = numberOne / numberTwo;
                System.out.println("Division: " + result);
                break;
            case ("remainder"):
                result = numberOne % numberTwo;
                System.out.println("Remainder: " + result);
                break;
            default:
                System.out.println("Invalid choice.");
        }

    }
}
