package Backtracking;

public class Merge_two_sorted_arrays {
    public static void main(String[] args) {

        int arr1[] = {3,5,7,9,11};
        int arr2 [] = {1,2,3,4,6,7};
        
    }

    public static int [] merge(int [] arr1 , int [] arr2){

        int i , j , k;
        i = j = k = 0;

        int ans[] = new int[arr1.length + arr2.length];
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]) ans[k++] = arr1[i++];
            else ans[k++] = arr2[j++];
        }

        while(i < arr1.length) ans[k++] = arr1[i++];
        while(j < arr2.length) ans[k++] = arr2[j++];

        return ans;

    }
}
