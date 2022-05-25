class Solution {
    public int maxEnvelopes(int[][] env) {
        Arrays.sort(env, (int[] a, int[] b) ->{
            return a[0]==b[0] ? b[1]-a[1] : a[0]-b[0];
        });
        int[] dp = new int[env.length];
        int maxlen = 0;
        for(int i = 0; i < dp.length; i++){
            //Find the index of height of envelope
            int index = binarySearch(dp, 0, maxlen, env[i][1]);
            
            dp[index] = env[i][1];
            
            if(index == maxlen)
                maxlen++;
        }
        return maxlen;
    }
    
    private int binarySearch(int[] arr, int start, int end, int target){
        int index = Arrays.binarySearch(arr, start, end, target);
        if(index < 0){
            index = -(index+1);
        }
        return index;
    }
}