class Solution {
    public int minHeightShelves(int[][] books, int shelfWidth) {
        int n = books.length;
        int dp[] = new int[n+1];
        //base case
        dp[0]=0;
        //dp[i] stores min possible height at i 
        for(int i=1;i<=n;i++){
            //current width and heights
            int w = books[i-1][0];
            int h = books[i-1][1];
            // worst case height will be min height so far + curr height
            dp[i] = dp[i-1]+h;
            //checking whether we can include previous books into current shelf
            for(int j=i-1;j>0;j--){
                //adding previous books width till we can hold them in current shelf
                w+=books[j-1][0];
                if(w<=shelfWidth){
                    //updating the max height among the books we included
                    h = Math.max(h,books[j-1][1]);
                //comparing min height possible at point previous to the last addition of book
                    //If on including books so far in current shelf give us height less than what we have in dp[i], we update dp[i]
                    dp[i]=Math.min(dp[i],dp[j-1]+h);
                }
                // if we cant hold more we simply break i.e stop adding previous books
                else
                    break;
            }
        }
        return dp[n];
    }
}

