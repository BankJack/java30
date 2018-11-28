package sort;

import java.util.Arrays;

/**
 * ֱ��ѡ������
 * @author nick
 *
 */
public class SelectSort {

	public static void main(String[] args) {
		int[] arr = {16,25,9,23,90}; //���������
		System.out.println("����ǰ��" + Arrays.toString(arr));
		
		for (int i = 0; i < arr.length - 1; i++) {
			int min = i; //���赱ǰѭ����i�±��ֵ����С��
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			
			//����������ڲ�ѭ�����ܹ�ȷ������ǰ��������Сֵ���±�
			if (min != i) {
				//����λ��
				int temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
			}
		}
		System.out.println("�����" + Arrays.toString(arr));
	}

}
