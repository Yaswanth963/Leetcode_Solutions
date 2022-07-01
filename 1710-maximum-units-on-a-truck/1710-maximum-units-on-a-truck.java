class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int sum=0;
        Arrays.sort(boxTypes,(o1,o2)->o2[1]-o1[1]);
        for(int[] in:boxTypes){
            if(in[0]<=truckSize){
                sum+=(in[1]*in[0]);
                truckSize-=in[0];
            }else{
                sum+=truckSize*in[1];
                truckSize=0;
            }
        }
        return sum;
    }
}