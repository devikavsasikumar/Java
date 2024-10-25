package JavaSessions;

public class StringReverse {

		//not treadsafe
		public static String reverseString(String str) {
			String reverse = "";
			char[] carr = str.toCharArray();
			for (int i = carr.length - 1; i >= 0; i--) {
				reverse = reverse + carr[i];
			}
			return reverse;

		}
	//not treadsafe
		public static StringBuilder reverseString1(String str) {
			StringBuilder strB = new StringBuilder();
			strB.append(str);
			return strB.reverse();

		}
	//treadsafe
		public static StringBuffer reverseString2(String str) {
			StringBuffer sb = new StringBuffer(str);
			return sb.reverse();
		}

		public static void main(String[] args) {
			String s = reverseString("java");
			System.out.println(s);

			StringBuilder sb = reverseString1("Selenium");
			System.out.println(sb);
			
			StringBuffer sbuff=reverseString2("TestNG");
			System.out.println(sbuff);

		}

	}


