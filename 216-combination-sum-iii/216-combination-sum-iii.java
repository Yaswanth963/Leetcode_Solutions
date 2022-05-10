class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        Integer a[]=new Integer[10];
        for(int i=0;i<10;i++)
            a[i]=i;
        fun(1,a,result,k,new ArrayList(),n);
        return result;
    }
    
    void fun(int i, Integer a[],List<List<Integer>> al,int k,List<Integer> temp,int sum){
        if(i==a.length){
            if(k==0 && sum==0)
            al.add(new ArrayList(temp));
            return;
        }
        if(k==0 && sum==0){
            al.add(new ArrayList(temp));
            return;
        }
        temp.add(a[i]);
        fun(i+1,a,al,k-1,temp,sum-a[i]);
        temp.remove(temp.size()-1);
        fun(i+1,a,al,k,temp,sum);
    }
}