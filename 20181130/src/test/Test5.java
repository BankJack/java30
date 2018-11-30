package test;

import java.util.Calendar;
import java.util.Date;

public class Test5 {

	public static void main(String[] args) {
		//test1();
		
		test2();
	}

	/**
	 * 为Calendar指定日期
	 */
	private static void test1() {
		Calendar c = Calendar.getInstance();
		//Date date = c.getTime();  //获取Calendar对象表述的时间对象
		//System.out.println(date);
		//具体指定年月日
		c.set(Calendar.YEAR, 2000); //设置年份
		c.set(Calendar.MONTH, 5); //设置月份，设置的月份需要-1
		c.set(Calendar.DATE, 30); //设置日期
		c.set(Calendar.HOUR, 16); //设置小时
		c.set(Calendar.MINUTE, 50); //设置分钟
		c.set(Calendar.SECOND, 40); //设置秒
		
		c.set(2015, 6, 31);  //同时设置年月日
		c.set(2008, 2, 20, 15, 31);//设置年月日时分
		c.set(2006, 8, 1, 20, 30, 25);//设置年月日时分秒
		
		Date date = c.getTime();  //获取Calendar对象表述的时间对象
		System.out.println(date);
	}
	
	private static void test2() {
		Calendar c = Calendar.getInstance();
		c.set(2006, 8, 1, 20, 30, 25);//设置年月日时分秒
		
		c.add(Calendar.MONTH, 50); //在Calendar代表的日期上加50个月
		
		int year = c.get(Calendar.YEAR); //获取年份
		int month = c.get(Calendar.MONTH) + 1; //获取月份
		int date = c.get(Calendar.DATE); //获取日期
		int hour = c.get(Calendar.HOUR);
		int am_pm = c.get(Calendar.AM_PM); //0上午   1下午
		
		int week_of_year = c.get(Calendar.WEEK_OF_YEAR); //日期是该年的第几周
		
		System.out.println("年份：" + year);
		System.out.println("月份：" + month);
		System.out.println("日期：" + date);
		System.out.println("时：" + hour);
		System.out.println("am_pm：" + am_pm);
		System.out.println("第几周：" + week_of_year);
	}
	
	private static void test3() {
		Calendar c = Calendar.getInstance();
		c.setTime(new Date());
		
		c.getTime();//获取Calendar代表的日期的对象
		
		c.getTimeInMillis(); //返回日期对象的毫秒表示形式
	}
}
