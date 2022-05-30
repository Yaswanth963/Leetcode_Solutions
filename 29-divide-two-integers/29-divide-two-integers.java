class Solution {
    public int divide(long dividend, long divisor) {
        if(dividend == Integer.MIN_VALUE && divisor==-1)
            return Integer.MAX_VALUE;
        if(dividend == Integer.MIN_VALUE && divisor==1)
            return Integer.MIN_VALUE;
        long div=0;int cnt=0,i=0;
        boolean positive =false;
        if((dividend<0 && divisor<0) || (dividend>0 && divisor>0))
            positive=true;
        dividend =Math.abs(dividend);
        divisor = (long)Math.abs(divisor);
        while(dividend>=divisor){
            div=divisor;i=1;
            //-div To handle while break condition
            while(div<=dividend-div){
                    div<<=1;
                    i<<=1;
            }
            cnt+=i;
            dividend-=div;
        }
        return positive?cnt:-cnt;
    }
}