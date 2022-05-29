class Solution {
    public int totalSteps(int[] nums) {
        Stack<int[]> st = new Stack<>();
        int n = nums.length;
        st.push(new int[]{nums[n-1],0});
        int max=0;
        for(int i=n-2;i>=0;i--){
            int c=0;
            while(!st.isEmpty() && st.peek()[0]<nums[i]){
                c++;
                int pop[] = st.pop();
                if(pop[1]>c)
                    c=pop[1];
            }
            st.push(new int[]{nums[i],c});
            max=Math.max(max,c);
        }
        return max;
    }
}