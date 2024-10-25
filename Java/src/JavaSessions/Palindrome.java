package JavaSessions;


	public class Palindrome {
		
		public static boolean chkPalindrome(String str) {
			
			StringBuilder sb=new StringBuilder();
			sb.append(str);
			String reversesStr=sb.reverse().toString();
			if(str.equals(reversesStr)) {
				System.out.println("the given string is a palindrome string");
				return true;
			}
			return false;
		}
		
		public static boolean isPalindrome(String str) {
			String reversedStr="";
			char[]c=str.toCharArray();
			
			for(int i=c.length-1;i>=0;i--) {
				reversedStr=reversedStr+c[i];
			}
			if(reversedStr.equalsIgnoreCase(str)) {
				System.out.println("the given string is a palindrome");
				return true;
			}
			return false;
		}
		
		
		

		public static void main(String[] args) {
			
			System.out.println(isPalindrome("malayalam"
					+ ""));
		}
		
		
		
		

	}


