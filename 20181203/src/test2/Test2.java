package test2;

import java.util.Arrays;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {
		//返回的不是一个ArrayList的实例，而是一个定长的集合
		List<String> list = Arrays.asList("a","b","c","d");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
