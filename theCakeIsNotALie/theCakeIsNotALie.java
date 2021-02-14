import java.util.Arrays;
import java.util.Iterator;
import java.util.HashSet;

public class theCakeIsNotALie {
	public static int solution(String x) {
//		int len = x.length();
//		StringBuffer str = new StringBuffer(x);
//		int result = -1;
//		HashSet<Integer> splits = new HashSet<Integer>(Arrays.asList(1));
//		for(int i = 2; i <= (int) Math.sqrt(len); i++) {
//			if(len % i == 0){
//				splits.add(i);
//				splits.add(len / i);
//			}
//		}
//		System.out.println(splits);
//		
//		Iterator itr = splits.iterator();
//		outerloop:
//		while(itr.hasNext()) {
//			boolean valid = true;
//            String part = x.substring(0, (int) itr.next());
//            for(int j = 1; j < (int) itr.next(); j++){
// 
//                if(!x.substring(j*(int) itr.next(), j*(int) itr.next()+ (int) itr.next()).equals(part)){
//                    valid = false;
//                    break;
//                }
// 
//            }
//            if(valid){
//                result = len/(int) itr.next();
//                break;
//            }
//		}
//		
//		return result; //change to 1 later

	int result = -1;
    int len = x.length();
    for(int i = len; i > 0; i--){           
        int n = len/i;
        if( n * i == len){
            boolean valid = true;
            String part = x.substring(0,n);
            for(int j = 1; j < i; j++){
 
                if(!x.substring(j*n,j*n+n).equals(part)){
                    valid = false;
                    break;
                }
 
            }
            if(valid){
                result = i;
                break;
            }
 
        }
 
 
    	}
    return result;
	}
	
	public static void main(String[] args) {
		System.out.println(solution("abcabcabc"));
	}
}
