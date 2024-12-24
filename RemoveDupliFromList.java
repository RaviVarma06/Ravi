package strings.com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDupliFromList {
	public static void main(String[] args) {
		List<String> myList=new ArrayList<String>();
		myList.add("blue");
		myList.add("red");
		myList.add("blue");
		myList.add("green");
		Set<String> set=new HashSet<>(myList);
		System.out.println(set);
	}

}
