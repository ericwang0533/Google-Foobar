import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
//import java.util.HashSet;

public class heyIAlreadyDidThat {
	public static int solution(String n, int  b) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put(n, 0);
//		char[] arr = n.toCharArray()
//		int num = Integer.parseInt(n);
//		int rev = Integer.parseInt(new StringBuilder(n).reverse().toString());
		
		
		int k = n.length();
		int counter = 1;
		char[] arr;
		int num, rev;
		while(true) {
//			System.out.println(map);
			
			arr = n.toCharArray();
			Arrays.sort(arr);
			num = Integer.parseInt(new String(arr), b);
			rev = Integer.parseInt(new StringBuilder(new String(arr)).reverse().toString(), b);
//			System.out.println(num);
//			System.out.println(rev);
			
			// subtract num from rev in base b
//			int diff = rev - num;
			
			
			String diff = Integer.toString(rev - num, b);
			String formatted = String.format("%0" + k + "d", Integer.parseInt(diff));
//			System.out.println(diff);
			
//			System.out.println(formatted);

			
			if(map.containsKey(formatted)) {
				return counter - map.get(formatted);
			}
			
			if(formatted == new String(new char[k]).replace('\0', '0')) {
				return 1;
			}
			
			map.put(formatted, counter);
			n = formatted;
			counter++;
		}
	}
	
	public static void main(String[] args) {
//		System.out.println(solution("1211", 10));
		System.out.println(solution("210022", 3));
	}
}
