import java.util.*;
class Solution {
    public List<String> addOperators(String num, int target) {

        List<String> list = new ArrayList<>();
        print( num ,  target ,  "" ,  0 ,  0 ,  0 , list );
        return list;
    
    }

    public static void print(String num, int target, String pathSum,long prev, long curr, int index, List<String> list) {

        if (index == num.length()) {
            if (prev == target) {
                list.add(pathSum);
            }
            return;
        }

        for (int i = index; i < num.length(); i++) {

            if (i != index && num.charAt(index) == '0') break;

            String currStr = num.substring(index, i + 1);
            long currVal = Long.parseLong(currStr);

            if (index == 0) {
                print(num, target, currStr, currVal, currVal, i + 1, list);
            } 
            else {
                print(num, target, pathSum + "+" + currStr, prev + currVal, currVal, i + 1, list);

                print(num, target, pathSum + "-" + currStr, prev - currVal, -currVal, i + 1, list);

                print(num, target, pathSum + "*" + currStr, prev - curr + curr * currVal, curr * currVal, i + 1, list);
            }
        }
    }
    
}