package half;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int[] arr = new int[100];

		System.out.println("���ڳ�ʼ������...");
		// ͨ��ѭ��Ϊ����Ԫ�ظ�ֵ
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100) + 1; // ����1-10000�������
		}
		
		//����������
		Arrays.sort(arr);
		
		System.out.println("������Ҫ���ҵ�����");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		int start = 0;
		int end = arr.length - 1;
		int middle = -1;
		boolean flag = false; //����û�������
		
		int count = 0;
		
		while(start <= end) {
			count++;
			middle = (start + end) / 2; //�м������±�
			if (num > arr[middle]) {
				start = middle + 1;
			} else if (num < arr[middle]) {
				end = middle - 1;
			} else {
				flag = true; //�ҵ��������
				break;
			}
		}
		
		if (flag) {
			System.out.println("�ҵ��ˣ�������������е��±꣺" + middle);
		} else {
			System.out.println("�����в����������");
		}
		System.out.println("�ܹ�������" + count + "��");
	}

}
