package JavaSessions;

public class Largest {

		public static void main(String[] args) {
			int a=120,b=510,c=9110;
			
//			if(a>b&&a>c) {
//				System.out.println("a is the greatest");
//			}
//			else if(b>a&&b>c) {
//				System.out.println("b is the greatest");
//			}
//			else {
//				System.out.println("c is the greatest");
//			}
			int large=a>b?a:b;
			int k=c>large?c:large;
			System.out.println("largest no of three is "+ k);
			
		}

	}


