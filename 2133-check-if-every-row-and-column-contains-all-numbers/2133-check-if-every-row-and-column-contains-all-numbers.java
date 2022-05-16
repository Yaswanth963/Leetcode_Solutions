class Solution {
    public boolean checkValid(int[][] mat) {
        Set<Integer> s1 = new HashSet<>();
        int m = mat.length;
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                if(s1.contains(mat[i][j]) || s1.contains(-mat[j][i]))
                    return false;
                s1.add(mat[i][j]);
                s1.add(-mat[j][i]);
            }
            if(s1.size()!=2*m)
                return false;
            s1.clear();
        }
        return true;
    }
}