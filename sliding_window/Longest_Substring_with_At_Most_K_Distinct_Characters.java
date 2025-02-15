package sliding_window;

import java.util.HashMap;

public class Longest_Substring_with_At_Most_K_Distinct_Characters {
    public static void main(String[] args) {

        int k = 2;
        String str = "abbbbbbc";
        System.out.println(kDistinctChars(k, str));
        
    }

    public static int kDistinctChars(int k, String str) {
		

		int left , right , maxlen ;
		left = right = maxlen = 0;

		HashMap< Character , Integer > map = new HashMap<>();

		while(right<str.length()){

			// growing phase 

			map.put(str.charAt(right) , map.getOrDefault(str.charAt(right),0)+1);

			// shrinking phase 

			while(map.size()>k && left <= right) {

				int freq = map.get(str.charAt(left));

				if(freq == 1) map.remove(str.charAt(left));
				else map.put(str.charAt(left), freq-1);

				left++;
			}

			// ans updation 

			maxlen = Math.max(maxlen, right-left +1);
			right++;
		}

		return maxlen;
	}
}
