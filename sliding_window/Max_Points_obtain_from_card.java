package sliding_window;

public class Max_Points_obtain_from_card {
    public static void main(String[] args) {

        int arr[]= {1,2,3,4,5,6,1};
        int k = 3;

        int lsum=0,rsum=0;
        int maxsum=0;
        for(int i=0;i<k;i++) lsum+=arr[i];
        maxsum=lsum;
        int right=arr.length-1;
        for (int i = k - 1; i >= 0; i--) {
            lsum -= arr[i];
            rsum += arr[right];
            right--;
            maxsum = Math.max(maxsum, lsum + rsum);
        }

        System.out.println(maxsum);
    }
}
