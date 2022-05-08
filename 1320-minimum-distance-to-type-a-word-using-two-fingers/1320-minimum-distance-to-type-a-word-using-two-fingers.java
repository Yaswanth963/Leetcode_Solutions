class Solution {
    public int minimumDistance(String word) {
        int min = Integer.MAX_VALUE;
        int dp[][][]= new int[26][26][300];
        for(int ddd[][]:dp){
            for(int dd[]:ddd){
                Arrays.fill(dd,-1);
            }
        }
        for(int i=0;i<26;i++){
            for(int j=0;j<26;j++){
                min= Math.min(min,find(i,j,word,0,dp));
            }
        }
        return min;
    }
    
    int find(int f1, int f2,String word,int i, int dp[][][]){
        if(i==word.length())
            return 0;
        if(dp[f1][f2][i]!=-1)
            return dp[f1][f2][i];
        int curr = word.charAt(i)-'A';
        int pos[]=getPos(curr);
        int res1=calc(getPos(f1),pos)+find(curr,f2,word,i+1,dp);
        int res2=calc(getPos(f2),pos)+find(f1,curr,word,i+1,dp);
        return dp[f1][f2][i]=Math.min(res1,res2);
    }
    
    int calc(int a[] , int b[]){
        return Math.abs(a[0]-b[0]) + Math.abs(a[1]-b[1]);
    }
    
    int[] getPos(int val){
        return new int[]{val/6,val%6};
    }
}



// class Solution {
// public:
//     int dp[305][26][26];
    
//     // Given a number [0-26], returns the coordinate of it in the keyboard.
//     pair<int,int> GetCoord(int num) {
//         return {num/6,num%6};
//     }
    
//     // Method to return distance between two coordinates.
//     int GetPairDist(pair<int,int> p1, pair<int,int> p2) {
//         return abs(p1.first - p2.first) + abs(p1.second - p2.second);
//     }
    
//     // Method to return distance between two numbers.
//     int GetCharDist(int c1, int c2) {
//         return GetPairDist(GetCoord(c1),  GetCoord(c2));
//     }
    
    
//     // Input is current index, character on which 1st finger is there, character on which 2nd finger is there
//     int recurse(int i, int p1, int p2, string& word) {
//         if(i == word.size()) {
//             return 0;
//         }
        
//         if(dp[i][p1][p2] != -1) {
//             return dp[i][p1][p2];
//         }
        
//         int nxt = word[i] - 'A';
        
//         // We need to go char in next index. Two possibilities either move 1st finger or 2nd finger.
//         int ans1 = recurse(i+1, nxt,p2, word) + GetCharDist(p1, nxt);
//         int ans2 = recurse(i+1, p1,nxt, word) + GetCharDist(p2, nxt);
//         dp[i][p1][p2] = min(ans1, ans2);
//         return min(ans1, ans2);
        
//     }
    
//     int minimumDistance(string word) {
//         int n = word.length();       
//         memset(dp, -1, sizeof(dp));
//         int mini = INT_MAX;
        
//         // Initially finger can be anywhere so trying all possible finger locations.
//         for(int i=0;i<26;i++) {
//             for(int j=0;j<26;j++) {
//                 mini = min(mini, recurse(0,i,j, word));
//             }
//         }
        
        
//         return mini;
//     }
// };