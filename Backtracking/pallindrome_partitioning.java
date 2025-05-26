public class pallindrome_partitioning {

    public static void main(String[] args) {

        String ques = "nitin";
        print(ques , "");
        
    }

    public static void print(String ques , String ans){

        if(ques.length() == 0) {
            System.out.println(ans);
            return;
        }

        for( int i=1; i<=ques.length(); i++){

            String sub = ques.substring(0 , i);

            if(isPallindrome(sub) == true) {
                print(ques.substring(i) , ans + sub + "|");
            }
        }

    }

    public static boolean isPallindrome(String str){
        int i=0 , j=str.length()-1;
        while(i<j) {
            if(str.charAt(i) != str.charAt(j)) return false;
            i++; 
            j--;
        }
        return true;
    }
}