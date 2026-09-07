package Module_1;

import java.util.Scanner;

class Marks {
    private double mark1;
    private double mark2;
    private double mark3;

    public Marks(double mark1, double mark2, double mark3) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    public double calculateTotal() {
        return mark1 + mark2 + mark3;
    }

    public double calculateAverage() {
        return calculateTotal() / 3;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Mark 1: ");
        double m1 = scanner.nextDouble();
        System.out.print("Enter Mark 2: ");
        double m2 = scanner.nextDouble();
        System.out.print("Enter Mark 3: ");
        double m3 = scanner.nextDouble();

        Marks studentMarks = new Marks(m1, m2, m3);

        System.out.println("\n--- Results ---");
        System.out.println("Total Marks: " + studentMarks.calculateTotal());
        System.out.printf("Average Marks: %.2f\n", studentMarks.calculateAverage());

        scanner.close();
    }
}
