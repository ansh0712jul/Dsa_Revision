package Binary_Search;

public class Minimum_Time_to_Complete_Trips {
    public static void main(String[] args) {

        int time[] = {1,2,3};
        int total = 5;
        long ans = minimumTime(time , total);

        
        
    }

    public static  long minimumTime(int[] time, int totalTrips) {

        return binarySearch(time , totalTrips );
        
    }

    public static long binarySearch(int time[] , int total){

        long lo = Integer.MAX_VALUE;
        long ans=-1;

        for(int i=0;i<time.length;i++){
            lo = Math.min(lo , time[i]);
        }

        long hi = lo*total;

        while(lo <= hi){

            long mid = lo + (hi-lo)/2;

            if(isPossible(time , mid) >= total){
                ans = mid;
                hi=mid-1;
            }
            else lo = mid+1;
        }

        return ans;
    }

    public static long  isPossible(int arr[] , long mid ){
        long total = 0;
        for(int i : arr){
            total += mid/i;
        }

        return total;
    }
}
