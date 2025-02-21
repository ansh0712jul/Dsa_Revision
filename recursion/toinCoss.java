public class toinCoss {
    public static void main(String[] args) {

        coinToss(3, "");
        
    }

    public static void coinToss(int n ,  String ans){

        if(n==0){
            System.out.print(ans +" ");
            return;
        }
        coinToss(n-1, ans+'H');
        coinToss(n-1, ans+'T');
    }
}
