public class count_sorted_vowel_string {
    
    public static void main(String[] args) {
        
        int n = 5;
        String s = "aeiou";
        System.out.println(count(n , 0 , 0 , s));
    }

    public static  int count( int n , int len , int index, String s ){

        if( len == n ) return 1;
        
        int cnt = 0;
        for(int i=index; i<5 ;i++) cnt += count( n , len+1, i, s );

        return cnt;
    }
}
