package p1;

public class Test7 {

	public static void main(String[] args) {
		int[] zhang = {170,60};
		int[] li = zhang;//���������������ͣ����������������ڴ��ַ
		System.out.println("ȥ���źƵ���ߣ�" + zhang[0] + "�����أ�" + zhang[1]);
		System.out.println("ȥ����������ߣ�" + li[0] + "�����أ�" + li[1]);
		
		//������������ߣ�180�����أ�70
		li[0] = 180;
		li[1] = 70;
		
		System.out.println("�����źƵ���ߣ�" + zhang[0] + "�����أ�" + zhang[1]);
		System.out.println("������������ߣ�" + li[0] + "�����أ�" + li[1]);
	}

}
