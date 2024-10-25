package JavaSessions;

public class Swap {
	public static void main(String args[]) {
		//using third variable
//		int a=10;
//		int c=a;
//		int b=4;
	//	
//		a=b;
//		b=c;
	//	
//		System.out.println("value of a now is :"+ a );
//		System.out.println("value of b is :"+ b );
//		System.out.println("value of c "+c);
		
	//************
		
		int a=10,b=4;
//		a=a+b;//10+4=14
//		b=a-b;
//		a=a-b;
		
//		System.out.println("value of a now is :"+ a );
	//System.out.println("value of b is :"+ b );
		
		
		//using single statement
		
		b=a+b-(a=b);
		System.out.println("value of a now is :"+ a );
	System.out.println("value of b is :"+ b );
		
		
	}
	}


