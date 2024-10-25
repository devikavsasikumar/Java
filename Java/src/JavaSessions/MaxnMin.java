package JavaSessions;

public class MaxnMin {


	public static void main(String[] args) {
		int arr[] = { 20, 10, 30, 45, 60 };
//		int max=arr[0];
//		
//		for(int i=0;i<=arr.length-1;i++) {
//			if(arr[i]>max) {
//				max=arr[i];
//			}
//		}
//		System.out.println("max of the given array is :"+max);
//		
		int min = arr[0];
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("min of the given array is :" + min);

		
	}

}


