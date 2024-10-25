package JavaSessions;



	import java.util.HashMap;
	import java.util.Map;

	public class  WordsCount {
	//using HashMAp
		
		public static Map<String, Integer> wordsMAp(String str) {
			String []wordArr=str.split(" ");
			Map<String,Integer> wordsMAp=new HashMap();
			for(int i=0;i<wordArr.length;i++) {
				wordsMAp.put(wordArr[i], 1);	
			}
			return wordsMAp; 
			
			
			
			
		}
		
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println(wordsMAp("java programs for practice"));
		}

	}


