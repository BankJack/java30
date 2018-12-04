package test5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Test1 {

	public static void main(String[] args) {
		LinkedHashSet<String> list = new LinkedHashSet<>();
		//Set<String> list = new HashSet<>();
		list.add("老余");
		list.add("小吴");
		list.add("陈总");
		
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String next = it.next();
			System.out.println(next);
		}
		
	}

}
