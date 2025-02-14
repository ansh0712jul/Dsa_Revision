package sliding_window;

public class kartik_bhaiya_and_String {
    public static void main(String[] args) {

        String s = "aabba";
        int k = 2;
        int aflip = maxFlipped(s,k,'a');
        int bflip = maxFlipped(s,k,'b');
        System.out.println(Math.max(aflip,bflip));
    }

    public static int maxFlipped(String s , int k, char ch){

        int ans,left,right,flip;
        ans = left = right = flip = 0;

        while(right < s.length()){

            //growing phase
            if(s.charAt(right) == ch) flip++;


            // shrinking phase

            while(flip > k && left<=right){
                if(s.charAt(left) == ch) flip--;
                left++;
            }

            // ans calculation 
            ans = Math.max(ans,right-left+1);
            right++;
        }

        return ans;

    }
    
}
