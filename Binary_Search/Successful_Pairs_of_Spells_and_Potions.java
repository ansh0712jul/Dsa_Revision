package Binary_Search;

import java.util.Arrays;

public class Successful_Pairs_of_Spells_and_Potions {

    public static void main(String[] args) {

        int spells[] = {5,1,3};
        int potions[] = {1,2,3,4,5};
        int success = 7;
        
    }

    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions); 
        int[] arr = new int[spells.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = potions.length - binarySearch(potions, success, spells[i]);
        }

        return arr;
    }

    public static int binarySearch(int[] potions, long success, int spell) {
        int lo = 0;
        int hi = potions.length - 1;
        int ans = potions.length; 

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (isPossible(mid, spell, success, potions)) {
                ans = (int) mid; 
                hi = mid - 1; 
            } else {
                lo = mid + 1; 
            }
        }

        return ans;
    }

    public static boolean isPossible(int mid, int spell, long success, int[] potions) {
        return (long)spell * potions[ mid] >= success;
    }
    
}


