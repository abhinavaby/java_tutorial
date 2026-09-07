package Module_1;

import java.util.Scanner;

class Employee {
    private int empId;
    private String empName;
    private double salary;

    public Employee(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    public void displayEmployee() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Salary: $" + salary);
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter details for Employee 1:");
        System.out.print("ID: ");
        int id1 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Name: ");
        String name1 = scanner.nextLine();
        System.out.print("Salary: ");
        double salary1 = scanner.nextDouble();

        Employee emp1 = new Employee(id1, name1, salary1);

        System.out.println("\nEnter details for Employee 2:");
        System.out.print("ID: ");
        int id2 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Name: ");
        String name2 = scanner.nextLine();
        System.out.print("Salary: ");
        double salary2 = scanner.nextDouble();

        Employee emp2 = new Employee(id2, name2, salary2);

        System.out.println("\n--- Employee Details ---");
        emp1.displayEmployee();
        emp2.displayEmployee();

        scanner.close();
    }
}