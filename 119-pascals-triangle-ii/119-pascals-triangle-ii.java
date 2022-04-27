class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> al = new ArrayList<>();
        al.add(1);
        List<Integer> prev = new ArrayList<>();
        for(int i=1;i<=rowIndex;i++){
            for(int j=1;j<i;j++){
                al.set(j,prev.get(j-1)+prev.get(j));
            }
        al.add(1);
        prev=new ArrayList(al);
        }
        return al;
    }
}