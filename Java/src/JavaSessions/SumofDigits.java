package JavaSessions;

public class SumofDigits {


		public static void main(String args[]) {
			int num = 12345;
			int add=0;

			while (num > 0) {
				add=add+num%10;
				num=num/10;
			}
			System.out.println("the sum of a digits is :"+add);

		}
	}


