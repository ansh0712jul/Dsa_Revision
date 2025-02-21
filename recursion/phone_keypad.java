public class phone_keypad {

    static String arr[] = {"" , "" , "abc" , "def" , "ghi" , "jkl" , "mno" , "pqrs" , "tuv" , "wxyz" };
    public static void main(String[] args) {

        printanswer("233" , "");
        
    }

    public static void printanswer(String str , String ans){
        
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        String pressed = arr[ch - '0'];
        for(int i=0;i<pressed.length();i++){
            printanswer(str.substring(1), ans+pressed.charAt(i));
        }
    }

    
}
