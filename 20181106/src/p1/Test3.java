package p1;

public class Test3 {

	public static void main(String[] args) {
		/*
		 * ���ڴ��п����˳���Ϊ5�Ŀռ�
		 * ÿ���ռ��Ԫ�ص�����ΪString
		 * String�������������ͣ����ÿ���ռ��Ĭ��ֵ��null
		 * */
		String[] arr = new String[5];
		//������[�±�] = ֵ;
		arr[0] = "ţ��";
		arr[1] = "����";
		
		//��ȡ�����е�Ԫ��
		//������[�±�]
		String str = arr[0];
		System.out.println(str);
		
		str = arr[2];//��ȡ�±�Ϊ2��Ԫ��
		System.out.println(str);//������Ϊnull����Ϊû��Ϊ�±�Ϊ2��Ԫ�ظ�ֵ
		
		//arr[5] = "���";//���д�������޷�ͨ������Ϊ���鳤��Ϊ5���±����Ϊ4����˻��������Խ����쳣
		//java.lang.ArrayIndexOutOfBoundsException    ����Խ����쳣
	}

}
