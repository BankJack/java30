package p1;

public class Test8 {

	public static void main(String[] args) {
		int[][] arr = new int[5][3];
		System.out.println(arr.length);
		
		System.out.println(arr[0].length);
		
		/*Ϊarr�����±�Ϊ0��Ԫ�أ�int[]��*/
		int[] a = arr[0];
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		
		arr[1][0] = 1;
		arr[1][1] = 2;
		arr[1][2] = 3;
		
		for (int i = 0; i < arr.length; i++) {
			int[] $arr = arr[i];
			for (int j = 0; j < $arr.length; j++) {
				System.out.print($arr[j] + " ");
			}
			System.out.println();
		}
		
	}

}
