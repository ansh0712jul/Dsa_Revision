public class all_binary_string {
    public static void main(String[] args) {

        System.out.println(printAns(3 , ""));
        
    }

    public static int printAns(int n , String ans){
        
        if(n==0){
            return 1;
        }
        
        int a , b;
        a = b = 0;
        a = printAns(n-1 , ans+0);

        // call if ans ki lenght zero taki error naaye ya frr tb zb last elemnt 1 na ho 
        if(ans.length() == 0 || ans.charAt(ans.length()-1)!='1'){
            b = printAns(n-1 , ans+1);
        }
        return a+b;
    }
}
