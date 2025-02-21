import java.util.ArrayList;

public class generate_paranthesis {
    public static void main(String[] args) {
        
        ArrayList<String> ls = new ArrayList<>();
        generate(0 , 0 , 3 ,"", ls);
        System.out.println(ls);
    }

    public static void generate(int op , int cl , int n , String ans ,  ArrayList<String> ls){
        
        if(op == n && cl == n){
           ls.add(ans);
            return;

        }

        if(op < n) generate(op+1 , cl , n ,ans+'(' , ls);
        if(cl < op) generate(op , cl+1 , n ,ans+')' , ls);
    }
}
