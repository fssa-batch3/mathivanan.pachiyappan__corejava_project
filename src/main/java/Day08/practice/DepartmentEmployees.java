package Day08.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class DepartmentEmployees {
    public static void main(String[] args) {
        HashMap<String, List<String>> departmentEmployees = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the comma-separated Department Name and Employee Name (e.g., HR,Ram).");
        System.out.println("Enter 'done' to finish.");

        while (true) {
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("done")) {
                break;
            }

            String[] values = input.split(",");
            String department = values[0].trim();
            String employee = values[1].trim();

            // Check if the department already exists in the HashMap
            if (departmentEmployees.containsKey(department)) {
                // Add the employee to the existing list
                List<String> employees = departmentEmployees.get(department);
                employees.add(employee);
            } else {
                // Create a new list and add the employee
                List<String> employees = new ArrayList<>();
                employees.add(employee);
                departmentEmployees.put(department, employees);
            }
        }

        // Output the Department Name along with the corresponding list of employees
        for (String department : departmentEmployees.keySet()) {
            List<String> employees = departmentEmployees.get(department);
            System.out.println(department + ": " + String.join(", ", employees));
        }

        scanner.close();
    }
}
