package sort;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {

		// ��������Ϊ10000�����飬�����е�Ԫ��Ϊ�����
		int[] arr = new int[10000000];

		System.out.println("���ڳ�ʼ������...");
		// ͨ��ѭ��Ϊ����Ԫ�ظ�ֵ
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100000) + 1; // ����1-10000�������
		}

		System.out.println("-----��ʼ����-----");
		long begin = System.currentTimeMillis();// ����1970-1-1 0:0:0��ʼִ���������ĺ���

		// ����ð������
		// test1(arr);

		// ����ѡ������
		// test2(arr);

		// ��������
		// test3(arr);

		//Arrays.sort(arr);
		
		//ϣ������
		test4(arr);

		long end = System.currentTimeMillis();
		long time = end - begin; // ����ʱ�����Ϊ������������ʱ���
		System.out.println("-----�����������ʱ�䣺" + time + "-----");// �õ����룬1��=1000����
	}

	/**
	 * ͨ��ð���������ָ��������������ִ��ʱ��
	 * 
	 * @param arr
	 */
	public static void test1(int[] arr) {
		int j, temp;
		for (int i = 0; i < arr.length - 1; i++) {
			for (j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) { // ���j�±����һ��ֵ�ȵ�ǰj�±��ֵС���򽻻�λ��
					temp = arr[j]; // ����λ��
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	/**
	 * ����ѡ���������
	 * 
	 * @param arr
	 */
	public static void test2(int[] arr) {
		int i, j, min;
		for (i = 0; i < arr.length - 1; i++) {
			min = i; // ���赱ǰѭ����i�±��ֵ����С��
			for (j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}

			// ����������ڲ�ѭ�����ܹ�ȷ������ǰ��������Сֵ���±�
			if (min != i) {
				// ����λ��
				int temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
			}
		}
	}

	/**
	 * ���ò�������
	 * 
	 * @param arr
	 */
	public static void test3(int[] arr) {
		for (int i = 1; i < arr.length; i++) { // �ӵڶ�������ʼ�Ƚϣ���Ϊ��һ����Ĭ������
			int temp = arr[i];
			int j = i; // ��j�±꿪ʼ����������Ƚ�
			for (; j > 0 && arr[j - 1] > temp; j--) {
				arr[j] = arr[j - 1]; // ��ǰһ���������һλ
			}
			arr[j] = temp;
		}
	}

	public static void test4(int[] arr) {
		// ����gap��������С����
		for (int gap = arr.length / 2; gap > 0; gap /= 2) {
			// �ӵ�gap��Ԫ�أ�����������������ֱ�Ӳ����������
			for (int i = gap; i < arr.length; i++) {
				int j = i;
				int temp = arr[j];
				if (arr[j] < arr[j - gap]) {
					while (j - gap >= 0 && temp < arr[j - gap]) {
						// �ƶ���
						arr[j] = arr[j - gap];
						j -= gap;
					}
					arr[j] = temp;
				}
			}
		}
	}
}
