class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        boolean[] bool = new boolean[nums.length];
        fun(nums,new ArrayList(),result,bool);
        return new ArrayList(result);
    }
    
    void fun(int a[], List<Integer> al,Set<List<Integer>> result,boolean used[]){
        if(al.size()==a.length){
            result.add(new ArrayList(al));
            return;
        }
        
        for(int i=0;i<a.length;i++){
            if(!used[i]){
                al.add(a[i]);
                used[i]=true;
                fun(a,al,result,used);
                al.remove(al.size()-1);
                used[i]=false;
            }
        }
    }    
}