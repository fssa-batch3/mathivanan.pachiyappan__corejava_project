package Day09.practice;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> arraySort = new ArrayList<Integer>();
		arraySort.add(8);
		arraySort.add(9);
		arraySort.add(45);
		arraySort.add(12);
		arraySort.add(1);
		
		Collections.sort(arraySort);
		
		System.out.println(arraySort);
		
	}

}
