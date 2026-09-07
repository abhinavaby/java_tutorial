package Module_1;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class VectorOperations {

    public static void main(String[] args) {
        System.out.println("=== 1. Add and Display String Elements ===");
        Vector<String> fruits = new Vector<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Grapes");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("\n=== 2. Remove an Element from a Vector ===");
        Vector<String> colors = new Vector<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        colors.remove("Green");
        System.out.println("Final contents: " + colors);

        System.out.println("\n=== 3. Sum All Elements in an Integer Vector ===");
        Vector<Integer> numbers = new Vector<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of elements: " + sum);

        System.out.println("\n=== 4. Find the Largest Number in a Vector ===");
        Vector<Integer> values = new Vector<>();
        values.add(25);
        values.add(60);
        values.add(15);
        values.add(80);
        values.add(45);

        int max = Collections.max(values);
        System.out.println("Maximum value: " + max);

        System.out.println("\n=== 5. Search for a String Element ===");
        Vector<String> items = new Vector<>();
        items.add("Pen");
        items.add("Notebook");
        items.add("Eraser");
        items.add("Marker");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter item name to search: ");
        String searchItem = scanner.nextLine();

        if (items.contains(searchItem)) {
            System.out.println("Item found");
        } else {
            System.out.println("Item not found");
        }

        scanner.close();
    }
}
