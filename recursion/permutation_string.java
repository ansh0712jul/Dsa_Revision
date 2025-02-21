import java.util.HashMap;

public class permutation_string {
    public static void main(String[] args) {
        
        int res = permutation("abac", "");
        System.out.println(res);
    }

    public static int  permutation(String str , String ans){

        if(str.length() == 0){
            System.out.println(ans + " ");
            return 1 ;
        }
        int cnt = 0;
        HashMap<Character , Integer> map = new HashMap<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            // for unique permutation
            if(!map.containsKey(ch)){
                String s = str.substring(0,i) + str.substring(i+1);
                map.put(ch , map.getOrDefault(ch , 0)+1);
                cnt += permutation(s, ans+ch);
                
            }
            
        }

        return cnt;
    }
}
