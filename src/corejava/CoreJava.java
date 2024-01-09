package corejava;

import java.util.Arrays;
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
        calculator();
        
        Calling method smallest Among Three Numbers
        smallestAmongThreeNumbers();
 
        Calling method array Sorting that take input of 1D array and sort the array ascending 
        array1D_Sorting();
        
        Calling method array2D Sorting that take input of 2D array and sort the array ascending 
        array2D_Sorting();*/
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

    public static void smallestAmongThreeNumbers() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any three integer numbers:");
        int numberOne = input.nextInt();
        int numberTwo = input.nextInt();
        int numberThree = input.nextInt();

        int result = ((numberOne < numberTwo) ? ((numberOne < numberThree) ? numberOne : numberThree) : (numberTwo < numberThree) ? numberTwo : numberThree);

        System.out.println("Smallest number: " + result);

    }

    public static void array1D_Sorting() {
        System.out.println("Please enter length of your array: ");
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();

        int[] array = new int[length];

        for (int index = 0; index < length; index++) {
            System.out.println("Enter an integer number to your array:");
            array[index] = input.nextInt();
        }

        System.out.println("Original Array: " + Arrays.toString(array));

        for (int firstNumber = 0; firstNumber < array.length - 1; firstNumber++) {
            for (int secondNumber = firstNumber + 1; secondNumber < array.length; secondNumber++) {
                if (array[firstNumber] > array[secondNumber]) {
                    int temporaryContainer = array[firstNumber];
                    array[firstNumber] = array[secondNumber];
                    array[secondNumber] = temporaryContainer;
                }
            }
        }
        System.out.print("Sorted Array: ");
        for (int value : array) {
            System.out.print(value + " ");
        }

    }

    public static void array2D_Sorting() {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter total number of row for your array: ");
        int rowLength = input.nextInt();

        System.out.println("Please enter total number of column for your array: ");
        int columnLength = input.nextInt();

        int[][] array2D = new int[rowLength][columnLength];

        for (int row = 0; row < rowLength; row++) {
            System.out.println("Enter integer numbers for the " + row + " position" + " row");
            for (int column = 0; column < columnLength; column++) {
                array2D[row][column] = input.nextInt();
            }
        }

        System.out.println("Original Array: ");
        for (int row = 0; row < array2D.length; row++) {
            System.out.print("{ ");
            for (int column = 0; column < array2D[row].length; column++) {
                System.out.print(array2D[row][column] + " ");
            }
            System.out.print("}");
            System.out.println("");
        }

        for (int firstRow = 0; firstRow < array2D.length; firstRow++) {
            for (int firstColumnValue = 0; firstColumnValue < array2D[firstRow].length - 1; firstColumnValue++) {
                for (int secondColumnValue = firstColumnValue + 1; secondColumnValue < array2D[firstRow].length; secondColumnValue++) {
                    if (array2D[firstRow][firstColumnValue] > array2D[firstRow][secondColumnValue]) {
                        int temporaryContainer = array2D[firstRow][firstColumnValue];
                        array2D[firstRow][firstColumnValue] = array2D[firstRow][secondColumnValue];
                        array2D[firstRow][secondColumnValue] = temporaryContainer;
                    }
                }
            }
        }
        System.out.println("Sorted Array: ");

        for (int row = 0; row < array2D.length; row++) {
            System.out.print("{ ");
            for (int column = 0; column < array2D[row].length; column++) {
                System.out.print(array2D[row][column] + " ");
            }
            System.out.print("}");
            System.out.println("");
        }
    }
}
