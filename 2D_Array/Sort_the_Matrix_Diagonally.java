class Solution {
    public int[][] diagonalSort(int[][] mat) {

        HashMap<Integer , ArrayList<Integer>> map = new HashMap<>();

        for(int i=0; i<mat.length; i++) {
            for(int j=0; j<mat[0].length; j++) {

                int key = i - j;
                map.putIfAbsent(key , new ArrayList<>());

                // putting the correct value 
                map.get(key).add(mat[i][j]);
            }
        }

        // sorting the each arraylist corresponding to key 

        for (Map.Entry<Integer, ArrayList<Integer>> e : map.entrySet()) {
            
            Collections.sort(e.getValue());
        }

        // now put all the value in the 2D Matrix but if i traverse from the front then i have to delete the entry from the front of the Arraylist list which is O(n) sol to overcome this i will traverse from the back and delete the entry from the end of the arraylist which is O(1),

        for( int i=mat.length -1; i>=0; i--) {
            for(int j = mat[0].length -1; j>=0; j--) {

                int key = i - j;
                List<Integer> list = map.get(key);; // new list wth same reference  
                mat[i][j] = list.get(list.size()-1);
                list.remove(list.size()-1);
                
            }
        }

        return mat;
        
    }
}