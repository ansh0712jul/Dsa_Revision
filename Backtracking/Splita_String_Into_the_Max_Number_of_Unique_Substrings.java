package Backtracking;

import java.util.HashSet;

public class Splita_String_Into_the_Max_Number_of_Unique_Substrings {

    public static void main(String[] args) {

        String s = "ababccc";
        Splita_String_Into_the_Max_Number_of_Unique_Substrings obj = new Splita_String_Into_the_Max_Number_of_Unique_Substrings();
        System.out.println(obj.maxUniqueSplit(s));
        
        
    }

    int max = 0;

    public int maxUniqueSplit(String s) {
        HashSet<String> set = new HashSet<>();
        backtrack(s, set, 0);
        return max;
    }

    public void backtrack(String s, HashSet<String> set, int index) {
        if (index == s.length()) {
            max = Math.max(max, set.size());
            return;
        }

        for (int i = index + 1; i <= s.length(); i++) {
            String substr = s.substring(index, i);
            if (!set.contains(substr)) {
                set.add(substr);
                backtrack(s, set, i);
                set.remove(substr); // backtrack
            }
        }
    }
    
}
