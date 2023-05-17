package udemy.src.application.exUdemyPoo;

import java.util.Locale;
import java.util.Scanner;

public class employeeProgram {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        employee emp = new employee();

        System.out.print("Name: ");
        emp.name = sc.nextLine();
        System.out.print("Gross Salary: ");
        emp.grossSalary = sc.nextDouble();
        System.out.println("Tax: ");
        emp.tax = sc.nextDouble();

        System.out.println();
        System.out.println("Employee: " + emp);
        System.out.println();
        System.out.println("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        emp.increaseSalary(percentage);

        System.out.println();
        System.out.println("Updated data: " + emp);

        sc.close();
    }
}
