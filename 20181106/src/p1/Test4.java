package p1;

import java.util.Scanner;

public class Test4 {
	/**
	 * �������飬��̬��Ϊ������ÿ��Ԫ�ظ�ֵ����ƽ����
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] scores = new double[5];
		//scores.length���Կ��Ի�ȡ����ĳ���
		for(int i = 0;i < scores.length;i++) {
			System.out.println("�������" + (i + 1) + "��ѧԱ�ĳɼ���");
			double score = input.nextDouble();
			//�����յĳɼ���ֵ�������Ӧ�Ŀռ�
			scores[i] = score;
		}
		
		/*��������*/
		double sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
			System.out.println("��" + (i + 1) + "��ѧԱ�ĳɼ�Ϊ��" + scores[i]);
		}
		System.out.println("ƽ���֣�" + sum / scores.length);
	}

}
