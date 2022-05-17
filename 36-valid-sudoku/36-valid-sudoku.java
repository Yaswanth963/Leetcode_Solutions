class Solution {
    public boolean isValidSudoku(char[][] board) {
        int m = board.length,n = board[0].length;
        Set<String> rows = new HashSet<>();
        Set<String> cols = new HashSet<>();
        Set<String> boxes = new HashSet<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                char temp = board[i][j];
                if(temp!='.'){
                String row = temp+"_"+i;
                String col = temp+"_"+j;
                String box = temp+"_"+(i/3)+"_"+(j/3);
                    if(rows.contains(row) || cols.contains(col) || boxes.contains(box))
                        return false;
                    else{
                        rows.add(row);
                        cols.add(col);
                        boxes.add(box);
                    }
                }else continue;
            }
        }
        return true;
    }
}