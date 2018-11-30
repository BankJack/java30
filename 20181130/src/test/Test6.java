package test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test6 {

	public static void main(String[] args) {
		LocalDateTime date = LocalDateTime.now();//获取当前时间 
		date = date.withYear(2008);  //修改年份
		date = date.withMonth(11);	//修改月份
		date = date.withDayOfMonth(30); //修改日期
		
		date = date.plusDays(35); //在2008-11-30上加上35天
		date = date.plusMonths(12);   //加上12个月
		
		date = date.minusDays(5); //减去5天
		/**
		 * 通过线程安全的方式获取日期格式化的工具
		 */
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String date_str = date.format(formatter);
		System.out.println(date_str);
		
		int year = date.getYear(); //获取年份
		int month_value = date.getMonthValue();//获取1-12的月份
		int month = date.getMonth().ordinal(); //0-11表示的月份
		System.out.println("month_value:" + month_value);
		System.out.println("month:" + month);
	}

}
