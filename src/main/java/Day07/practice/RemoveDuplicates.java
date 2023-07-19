package Day07.practice;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        // Create an ArrayList with duplicate entries
        ArrayList<Integer> numbersList = new ArrayList<>();
        numbersList.add(1);
        numbersList.add(2);
        numbersList.add(3);
        numbersList.add(2);
        numbersList.add(4);
        numbersList.add(1);
        numbersList.add(5);

        System.out.println("Original List: " + numbersList);

        // Use a HashSet to remove duplicates
        HashSet<Integer> uniqueNumbers = new HashSet<>(numbersList);

        // Display the unique values
        System.out.println("Unique Values: " + uniqueNumbers);
    }
}