package test;

import java.util.Date;

public class Test2 {

	public static void main(String[] args) {
		Date date = new Date();//当前时间
		//System.out.println(date);
		
		//1秒=1000毫秒
		
		long time = System.currentTimeMillis();
		date = new Date(time);//根据毫秒数转换为Date
		//System.out.println(date);
		
		time = date.getTime();//将日期对象转换为1970-1-1 至对象所表示时间之间的毫秒数
		System.out.println(time);
	}

}
