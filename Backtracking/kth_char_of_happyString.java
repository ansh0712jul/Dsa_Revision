import java.util.*;
class Solution {
    public String getHappyString(int n, int k) {

        StringBuilder sb = new StringBuilder();
        List<String> ans = new ArrayList<>();
        print(n , k , sb , ans);

        if(ans.size() < k) return "";
        else return ans.get(k-1);     
    }

    public static void print( int n  , int k , StringBuilder sb , List<String> ans) {

        if(sb.length() == n) {
            ans.add(sb.toString());
            return ; 
        }

        for( char i='a'; i<='c'; i++) {

            if( sb.length() != 0 && sb.charAt(sb.length()-1) == i) continue;

            sb.append(i);
            print(n , k , sb , ans);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}