package test5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TestFood {
	public static void main(String[] args) {
		/**
		 * 自定义比较器
		 * 定制排序
		 */
		TreeSet<Food> tree = new TreeSet<>(new Comparator<Food>() {

			@Override
			public int compare(Food o1, Food o2) {
				return (int)(o1.getPrice() - o2.getPrice());
			}
		});
		
		List<String> foods = Arrays.asList("牛肉干","豆腐干","果冻","梁平张鸭子","郫县豆瓣","袁驿豆干","涪陵榨菜");
		
		for (int i = 0; i < foods.size(); i++) {
			int ran_food = (int)(Math.random() * foods.size());
			double ran_price = Math.random() * 100;
			Food food = new Food(foods.get(ran_food), ran_price);
			tree.add(food);
		}
		
		//遍历集合
		for (Food f : tree) {
			System.out.println(f);
		}
	}
}
