package package1;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������һ����:");
		int num = input.nextInt();
		int temp = num;   //��num����
		int len = 0;

		//ͨ��ѭ�����������м�λ
		while(temp > 0){
			temp /= 10;	// temp = temp / 10;
			len++;
		}
		boolean isTrue = true; //����������ǻ�����
		for(int i = 0;i < len / 2;i++){ //Ҫ���Ϊʲôlen/2
			//��ǰѭ���������λ
			int pow = (int)(Math.pow(10,len - 1 - i));
			int left = num / pow % 10;
			//��ǰѭ�����������λ
			
			pow = (int)(Math.pow(10,i));
			int right = num / pow % 10;
			if(left != right){
				isTrue = false; //��ߺ��ұ߲���ͬ����˵����������ǻ�����
				break;
			}
		}
		if(isTrue){
			System.out.println(num + "�ǻ�����");
		} else {
			System.out.println(num + "���ǻ�����");
		}
		input.close();
	}
}
