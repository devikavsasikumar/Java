package JavaSessions;

public class FibonacciSeries {



		// 0 1 1 2 3 5

		public static void printFibonacci(int count) {
			int n1 = 0, n2 = 1, n3;
			System.out.print(n1+" "+ n2+" ");	
			for(int i=2;i<count;i++) {
				n3=n1+n2;
				n1=n2;
				n2=n3;
				System.out.print(n3+" ");				
			}	
		}
		//using recursion
		

		public static void main(String a[]) {
			printFibonacci(8);
		}

	}

