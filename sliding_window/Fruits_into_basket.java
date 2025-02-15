package sliding_window;
import java.util.HashMap;

public class Fruits_into_basket {
    public static void main(String[] args) {

        int fruits [] = { 1,2,3,2,2 };
        System.out.println(totalFruit(fruits));
        
    }

    public static int totalFruit(int[] fruits) {

        HashMap< Integer , Integer > map = new HashMap<>();

        int left , right , maxlen ;
        left = right = maxlen = 0;

        while(right < fruits.length){

            // growing phase
            map.put(fruits[right] , map.getOrDefault(fruits[right],0)+1 );


            // shrinking phase 
            while(map.size() > 2 && left <= right){

                int freq = map.get(fruits[left]);
                if (freq == 1)  map.remove(fruits[left]); 
                else map.put(fruits[left], freq - 1);  
                left++;
            }

            // ans updation 
            maxlen = Math.max(maxlen,right-left+1);
            right++;
        }

        return maxlen;
        
    }
}
