package sort;

import java.util.Arrays;

/**
 * ð������
 * @author nick
 *
 */
public class BubbleSort {

	/**
	 * ͨ��javaʵ��ð������
	 * @param args �ⲿ����
	 */
	public static void main(String[] args) {
		int[] arr = {16,25,9,23,90}; //���������
		System.out.println("����ǰ��" + Arrays.toString(arr));
		/*
		 * N���������Ŷӣ��������С��ǰ
		 * ���ѭ��N-1���ڲ�ѭ��N-1-i
		 * */
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) { //���j�±����һ��ֵ�ȵ�ǰj�±��ֵС���򽻻�λ��
					int temp = arr[j];  //����λ��
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		
		/*
		 * ͨ��forѭ����������
		 * */
		/*for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}*/
		
		String str = Arrays.toString(arr); //ͨ��Arrays.toString()����������ת��Ϊ�ַ�����
		System.out.println("�����" + str);
	}

}
