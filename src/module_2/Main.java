package module_2;

import java.util.Scanner;

class employee {
    String name;
    String address;
    int age;
    int mob;
    float sal;

    public void print_Salary() {
        System.out.println("Salary: " + sal);
    }
}

class officer extends employee {
    String spl;

    public void print_Specialization() {
        System.out.println("Specialization: " + spl);
    }
}

class manager extends employee {
    String dep;

    public void print_Dept() {
        System.out.println("Department: " + dep);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        officer off = new officer();
        System.out.println("Enter Officer Details:");
        System.out.print("Name: ");
        off.name = scanner.nextLine();
        System.out.print("Address: ");
        off.address = scanner.nextLine();
        System.out.print("Specialization: ");
        off.spl = scanner.nextLine();
        System.out.print("Age: ");
        off.age = scanner.nextInt();
        System.out.print("Mobile Number: ");
        off.mob = scanner.nextInt();
        System.out.print("Salary: ");
        off.sal = scanner.nextFloat();
        scanner.nextLine();

        manager mgr = new manager();
        System.out.println("\nEnter Manager Details:");
        System.out.print("Name: ");
        mgr.name = scanner.nextLine();
        System.out.print("Address: ");
        mgr.address = scanner.nextLine();
        System.out.print("Department: ");
        mgr.dep = scanner.nextLine();
        System.out.print("Age: ");
        mgr.age = scanner.nextInt();
        System.out.print("Mobile Number: ");
        mgr.mob = scanner.nextInt();
        System.out.print("Salary: ");
        mgr.sal = scanner.nextFloat();

        System.out.println("\n--- Officer Details ---");
        System.out.println("Name: " + off.name);
        System.out.println("Address: " + off.address);
        System.out.println("Age: " + off.age);
        System.out.println("Mobile: " + off.mob);
        off.print_Salary();
        off.print_Specialization();

        System.out.println("\n--- Manager Details ---");
        System.out.println("Name: " + mgr.name);
        System.out.println("Address: " + mgr.address);
        System.out.println("Age: " + mgr.age);
        System.out.println("Mobile: " + mgr.mob);
        mgr.print_Salary();
        mgr.print_Dept();

        scanner.close();
    }
}
