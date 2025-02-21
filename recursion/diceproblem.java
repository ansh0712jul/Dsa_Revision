
// you are given an array containg jumps you have to reach from src to end by using the value of array and print all the ways  

public class diceproblem {
    public static void main(String[] args) {

        int arr[] = {1,2,3};
        printWays(0, 4, arr, "");
        
    }

    public static void printWays(int src , int des , int arr[] , String ans){

        if(src == des) {
            System.out.println(ans + " ");
            return;
        }

        if(src > des){
            return ;
        }

        for(int i=1; i<=arr.length; i++){
            printWays(src+i, des, arr, ans+i);
        }
    }
}
