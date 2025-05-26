class Solution {
    List<String> result = new ArrayList<>();

    public List<String> letterCasePermutation(String s) {
        backtrack(s, 0, "");
        return result;
    }


    public void backtrack(String s, int index, String current) {
        if (index == s.length()) {
            result.add(current);
            return;
        }

        char ch = s.charAt(index);

        if (Character.isDigit(ch)) {
            backtrack(s, index + 1, current + ch);
        } else {
            backtrack(s, index + 1, current + Character.toLowerCase(ch));
            backtrack(s, index + 1, current + Character.toUpperCase(ch));
        }
    }
}