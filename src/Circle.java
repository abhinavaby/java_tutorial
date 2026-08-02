
import java.util.Scanner;

public class Circle {
    double radius;

    Circle(double r) {
        radius = r;
    }

    void calculate() {
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;

        System.out.printf("Area = %.2f\n", area);
        System.out.printf("Circumference = %.2f\n", circumference);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Radius: ");
        double r = sc.nextDouble();

        Circle c = new Circle(r);
        c.calculate();

        sc.close();
    }
}