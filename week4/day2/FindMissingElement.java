package week4.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMissingElement {

	public static void main(String[] args) {

		List<Integer> array = new ArrayList<Integer>();
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(4);
		array.add(10);
		array.add(6);
		array.add(8);
		System.out.println("Array List is:" + array);
		Collections.sort(array);
		System.out.println("Array List after sorting is" + array);
		System.out.println("Missing numbers in the list is: ");
		for (int i = 0; i < array.size() - 1; i++) {
			int current = array.get(i);
			int next = array.get(i + 1);
			if (current + 1 != next) {
				for (int j = current + 1; j < next; j++) {
					System.out.println(j);
				}
			}

		}

	}

}
