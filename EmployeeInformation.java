import java.util.Scanner;

public class EmployeeInformation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String name = input.nextLine();

        System.out.print("Enter employee ID: ");
        int id = input.nextInt();

        System.out.print("Enter employee age: ");
        int age = input.nextInt();

        System.out.print("Enter employee salary: ");
        double salary = input.nextDouble();

        System.out.println("\nEmployee Information:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Age: " + age);
        System.out.println("Salary: \u20B9" + salary);
    }
}