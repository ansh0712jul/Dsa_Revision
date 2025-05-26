public class String_partitioning {
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
             print(ques.substring(i) , ans + sub + "|");
        }

    }
}
