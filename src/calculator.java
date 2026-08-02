

import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter Second Number: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter Operator (+, -, *, /): ");
        char op = sc.next().charAt(0);

        switch (op) {

            case '+':
                System.out.println("Result = " + (num1 + num2));
                break;

            case '-':
                System.out.println("Result = " + (num1 - num2));
                break;

            case '*':
                System.out.println("Result = " + (num1 * num2));
                break;

            case '/':
                if (num2 != 0)
                    System.out.println("Result = " + (num1 / num2));
                else
                    System.out.println("Division by zero is not allowed.");
                break;

            default:
                System.out.println("Invalid Operator.");
        }

        sc.close();
    }
}
