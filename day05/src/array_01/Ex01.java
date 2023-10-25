package array_01;

public class Ex01 {
	public static void main(String[] args) {
		int arr[] = {1,2,3};
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		//int arr2[] = new int[5];
		int arr2[] = new int[] {11,22,33,44,55};
		System.out.println("arr.length : "+arr.length);
		System.out.println("arr2.length : "+arr2.length);
		
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
	}
}
