package test;

import java.util.Date;

public class Test3 {

	public static void main(String[] args) {
		Date date = new Date();
		
		int year = date.getYear();//方法中带有删除线，说明这个方法过时了。在将来某个时间该方法可能被移除
		int month = date.getMonth() + 1; //月份,获取月份的值 0-11  0代表1月   11代表12月
		int d = date.getDate();  //日期
		int day = date.getDay(); //星期几
		
		System.out.println(year + "-" + month + "-" + d + " " + day);
	}

}
