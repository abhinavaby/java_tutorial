package Module_1;

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void displayCalculations() {
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;

        System.out.println("Radius: " + radius);
        System.out.printf("Area: %.2f\n", area);
        System.out.printf("Circumference: %.2f\n", circumference);
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        circle.displayCalculations();
    }
}