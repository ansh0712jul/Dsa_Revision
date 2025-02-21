public class subSequenceOnString {

    public static void main(String[] args) {

        printSubSequence("abc", "");
        
    }

    public static void printSubSequence(String str , String ans){


        if(str.length() == 0){
            System.out.println(ans + "");
            return ;
        }

        char ch = str.charAt(0);
        printSubSequence(str.substring(1), ans);
        printSubSequence(str.substring(1), ans+ch);
        

    }
}