package test2;

public class Test2 {

	public static void main(String[] args) {
		String str = "我爱android编程，android也爱我,嘿嘿嘿，你猜我爱你还是你爱我吗？";
		
		/*int index = str.indexOf("爱");//返回爱的索引
		
		index = str.indexOf("爱",index + 1);
		
		index = str.indexOf("爱",index + 1); //最终indexOf返回-1说明不包含爱
		
		System.out.println(index);*/
		int count = a(0,str,"爱");
		System.out.println(count);
	}

	/**
	 * 递归
	 * 在方法中重复不断的调用自己(相当于死循环)
	 * 正确使用递归，必须保证方法能够退出
	 * 
	 * 递归通常结合if条件判断使用，根据条件执行递归
	 */
	public static int a(int count,String str,String target) {
		//方法入口会执行的代码
		if(str.indexOf(target) != -1) {//相当于循环条件
			int index = str.indexOf(target);
			str = str.substring(index + 1);  //循环变量值改变
			count++; //说明包含target
			count = a(count,str,target);
		}
		//方法出口会执行的代码
		return count;
	}
	
}
