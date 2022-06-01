class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        if(n==1)return 0;
        //maxReach=max index we can reach
        //steps=remaining steps we can still move with current power
        //jumps=number of jumps we made so far
        int maxReach=nums[0],steps=nums[0],jumps=1;
        for(int i=1;i<n-1;i++){
            //update our maxReach power
            maxReach=Math.max(maxReach,nums[i]+i);
            //decrement steps each time we made a move
            steps--;
            //if our power gone to 0
            if(steps==0){
                //we increment our jumps
                jumps++;
                //we update our power with the maxReach we obtained previously
                steps=maxReach-i;
            }
        }
        return jumps;
    }
}