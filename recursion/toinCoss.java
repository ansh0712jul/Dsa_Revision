public class toinCoss {
    public static void main(String[] args) {

        coinToss(3, "");
        notHead(3, "");
        
    }

    public static void coinToss(int n ,  String ans){

        if(n==0){
            System.out.print(ans +" ");
            return;
        }
        coinToss(n-1, ans+'H');
        coinToss(n-1, ans+'T');
    }

    public static void notHead(int n , String ans){

        if(n==0){
            System.out.println(ans);
            return;
        }
        
        if(ans.length()==0 || ans.charAt(ans.length()-1) != 'H'){
            notHead(n-1, ans+'H');
        }
        notHead(n-1, ans+'T');
        
    }
}


// extended question -->
// print only those sequences which doesn't contain consecutive heads