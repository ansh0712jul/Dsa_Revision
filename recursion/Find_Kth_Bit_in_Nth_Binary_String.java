public class Find_Kth_Bit_in_Nth_Binary_String {
    
    public static void main(String[] args) {

        String ans = find(4);
         System.out.println(ans.charAt(3-1));
        
    }

    public static  String  find( int n ) {

        if( n==1 ) return "0";

        StringBuilder sb = new StringBuilder();
        String prev = find(n-1);
        sb.append(prev);
        sb.append("1");
        sb.append(reverseAndInvert(prev));

        return sb.toString();

    }

    // Function to reverse and invert a binary string
    private static String reverseAndInvert(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            sb.append(c == '0' ? '1' : '0');
        }

        return sb.toString();
    }
}
