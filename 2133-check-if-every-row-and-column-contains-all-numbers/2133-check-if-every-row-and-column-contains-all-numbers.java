class Solution {
    public boolean checkValid(int[][] mat) {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        int m = mat.length;
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                s1.add(mat[i][j]);
                s2.add(mat[j][i]);
            }
            if(s1.size()!=m || s2.size()!=m)
                return false;
            s1.clear();s2.clear();
        }
        return true;
    }
}