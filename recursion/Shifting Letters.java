class Solution {
    public String shiftingLetters(String s, int[] shifts) {

        long opern[] = new long [shifts.length+1];
        opern[opern.length-1] = 0;
        for(int i=opern.length-2 ; i>=0 ; i--) opern[i] = (shifts[i] + opern[i + 1]) % 26;
        

        StringBuilder sb = new StringBuilder();
        for( int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
           

            int shifted = (int)(ch - 'a' + (int)opern[i]) % 26;
            sb.append((char) (shifted + 'a'));
        }
        return sb.toString();
        
    }
}