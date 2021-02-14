import java.util.ArrayList;
import java.util.Arrays;

public class numberesStationCodedMessages {
	public static int[] solution(int[] l, int t) {
		// prefix sums
		ArrayList<Integer> psum = new ArrayList<Integer>(Arrays.asList(l[0]));
		for(int i = 1; i < l.length; i++) {
			psum.add(l[i] + psum.get(i-1));
		}
//		System.out.println(psum); //dbg
		
		// check if starting at i=0 has a valid solution, incrementing up
		if(psum.contains(t)) {
			return new int[] {0, psum.indexOf(t)};
		}
		
		for(int i = 1; i < l.length; i++) {
			if(psum.contains(t + psum.get(i-1))) {
				return new int[] {i, psum.indexOf(t + psum.get(i-1))};
			}
		}
		
		return new int[] {-1, -1};
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[] {1, 2, 3, 4}, 15)));
		System.out.println(Arrays.toString(solution(new int[] {4, 3, 10, 2, 8}, 12)));
	}
}
