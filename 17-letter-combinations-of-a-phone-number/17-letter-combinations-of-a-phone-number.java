class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> al = new ArrayList<>();
        if(digits.isEmpty())
            return al;
        Map<Integer,String> map = new HashMap<>();
        al.add("");
        map.put(2,"abc");map.put(3,"def");map.put(4,"ghi");map.put(5,"jkl");
                 map.put(6,"mno");map.put(7,"pqrs");map.put(8,"tuv");map.put(9,"wxyz");
        for(char ch:digits.toCharArray()){
            String str = map.get(ch-'0');
            List<String> als = new ArrayList<>();
            for(String st:al){
                for(char c:str.toCharArray()){
                    als.add(st+c);
                }
            }
            al = new ArrayList<>(als);
        }
        return al;
    }
}