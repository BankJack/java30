package sort;

import java.util.Arrays;

/**
 * ��������
 * @author Administrator
 *
 */
public class InsertSort {

	public static void main(String[] args) {
		int[] arr = {16,25,9,23,90}; //���������
		
		for (int i = 1; i < arr.length; i++) { //�ӵڶ�������ʼ�Ƚϣ���Ϊ��һ����Ĭ������
			int temp = arr[i];
			int j = i;  //��j�±꿪ʼ����������Ƚ�
			for (; j > 0 && arr[j - 1] > temp; j--) {
				arr[j] = arr[j - 1]; //��ǰһ���������һλ
			}
			arr[j] = temp;
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
