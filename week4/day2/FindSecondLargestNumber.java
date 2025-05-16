package week4.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestNumber {

	public static void main(String[] args) {

		List<Integer> array = new ArrayList<Integer>();
		array.add(3);
		array.add(2);
		array.add(11);
		array.add(4);
		array.add(6);
		array.add(7);
		Collections.sort(array);
		System.out.println("Array after sorting is: " + array);
		int secondNumber = array.get(array.size() - 2);
		System.out.println("Second largest number is: " + secondNumber);
	}

}
