package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test4 {

	public static void main(String[] args) {
		Date date = new Date(); //当前日期
		//将日期转换为 yyyy-MM-dd
		String str = format("yyyy-MM-dd", date);
		System.out.println(str);
		
		String str2 = format("yyyy年MM月dd日", date);
		System.out.println(str2);
		
		String str3 = format("yyyy-MM-dd HH:mm:ss S a E", date);
		System.out.println(str3);
		
		String date_str = "2018-1-1 15:30:26";
		date = parse(date_str, "yyyy-MM-dd HH:mm:ss");
		System.out.println(date);
	}
	
	/**
	 * 将日期对象按照规定的格式转换为字符串
	 * @param pattern
	 * @param date
	 * @return
	 */
	private static String format(String pattern,Date date) {
		//初始化格式Date对象的日期
				//设置日期的格式化方式
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		return sdf.format(date);
	}

	private static Date parse(String date,String pattern) {
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		try {
			return sdf.parse(date);
		} catch (ParseException e) { //在转换字符串过程中可能会出现转换异常
			e.printStackTrace();
		}
		return null;
	}
}
