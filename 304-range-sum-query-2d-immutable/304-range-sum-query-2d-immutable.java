class NumMatrix {
    int pre[][];
    public NumMatrix(int[][] matrix) {
        int m = matrix.length,n = matrix[0].length;
        pre= new int[m][n];   
        for(int i=0;i<m;i++){
            pre[i][0] = matrix[i][0];
        }
        for(int i=0;i<m;i++){
            for(int j=1;j<n;j++){
                pre[i][j] = pre[i][j-1]+matrix[i][j];
            }
        }
        
        for(int i=1;i<m;i++){
            for(int j=0;j<n;j++){
                pre[i][j] += pre[i-1][j];
            }
        }
        
        
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int totsum=pre[row2][col2];
        totsum-=row1>0?pre[row1-1][col2]:0;
        totsum-=col1>0?pre[row2][col1-1]:0;
        totsum+=row1>0 && col1>0 ?pre[row1-1][col1-1]:0;
        return totsum;
    }
}

// 3  3  4  8  10
// 5  11 14 16 17
// 1  3  3  4  9
// 4  5  5  6  13
// 1  1  4  4  9
    

// 3  3   4 8  10 
// 8  14 18 24 27
// 9  17 21 28 36
// 13 22 26 34 49
// 14 23 30 38 58