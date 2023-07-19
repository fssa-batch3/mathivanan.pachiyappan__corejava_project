package Day08.practice;


import java.util.HashMap;
import java.util.Scanner;

public class CountNames {
    public static void main(String[] args) {
        HashMap<String, Integer> nameCountMap = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String input = scanner.nextLine();

        // Split the input string into an array of names
        String[] names = input.split(",\\s*");

        // Count the occurrences of each name
        for (String name : names) {
            name = name.trim();
            int count = nameCountMap.getOrDefault(name, 0);
            nameCountMap.put(name, count + 1);
        }

        // Output the counts of each name
        for (String name : nameCountMap.keySet()) {
            int count = nameCountMap.get(name);
            System.out.println(name + ": " + count);
        }

        scanner.close();
    }
}
