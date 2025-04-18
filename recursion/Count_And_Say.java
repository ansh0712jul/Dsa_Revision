public class Count_And_Say {
    public static void main(String[] args) {

        System.out.println(count(5));
        
    }

    public static  String count( int n ) {

        if ( n == 1) return "1";

        String prev = count( n-1 );
        StringBuilder sb = new StringBuilder();

        int cnt = 1;
        for( int i=1; i<prev.length(); i++) {
            
            if( prev.charAt(i) == prev.charAt(i-1)) cnt++;

            else {
            sb.append(cnt).append(prev.charAt(i-1));
            cnt = 1;
            }
        }

        

        // addition for nth number 
        sb.append(cnt).append(prev.charAt(prev.length() - 1));

        return sb.toString();

    }
}
