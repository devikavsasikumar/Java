package JavaSessions;


	import java.util.ArrayList;
	import java.util.List;

	public class OddEven {

		public static void odd(int no) {
			if (!((no % 2) == 0)) {
				System.out.println("given no is odd");
			}

		}

		public static void even(int no) {
			if (no % 2 == 0) {
				System.out.println("given no is even");
			}
		}

		public static boolean oddParallelStream(List<Integer> list) {
			return list.parallelStream().anyMatch(x -> x % 2 != 0);
		}

		public static void EvenParallelStream() {

		}
	
		public static void printNos(List<Integer> listNo) {
//			for(int nos:listNo) {
//				if(nos%2==0) {	
//					break;
//				}	
//			}System.out.println("the given array contains even nos");
			
			System.out.println(listNo.parallelStream().anyMatch(x->x%2!=0));
			
		}

		public static void main(String[] args) {
			List<Integer> list = new ArrayList<Integer>();
			list.add(10);
			list.add(12);
			list.add(11);
			System.out.println(oddParallelStream(list));
			printNos(list);


		}

	}
