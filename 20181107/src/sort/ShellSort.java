package sort;

public class ShellSort {

	public static void main(String[] args) {
		int[] arr = {5,8,1,6,4,3,2,7}; //���������
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
