class Solution {
        List<List<Integer>> finalList = new ArrayList<>();
    public List<List<Integer>> generate(int numRows) {
        List<Integer> temp = new ArrayList<>();
        temp.add(1);
        finalList.add(new ArrayList(temp));
        modifyList(numRows,temp);
        return finalList;
    }
    
    void modifyList(int rows,List<Integer> temp){
        for(int i=1;i<rows;i++){
            List<Integer> last = finalList.get(i-1);
            for(int j=1;j<last.size();j++){
                temp.set(j,last.get(j-1)+last.get(j));
            }
        temp.add(1);
        finalList.add(new ArrayList(temp));
        }
    }
}