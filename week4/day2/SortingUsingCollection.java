package week4.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {

		List<String> stringList = new ArrayList<String>();
		stringList.add("Wipro");
		stringList.add("HCL");
		stringList.add("CTS");
		stringList.add("Aspire Systems");
		System.out.println("String list is: " + stringList);
		Collections.sort(stringList);
		System.out.println("String list after sorting is " + stringList);
		System.out.println("Reverse string list is: ");
		for (int i = stringList.size() - 1; i >= 0; i--) {
			System.out.println(stringList.get(i));
		}

	}

}
