Start subtracting divisor and increment count and return the count if dividend<divisor. It gives TLE.
-------------------------------------
​
We start with divisior and we keeep on incrementing divisor+divisor........ and cnt++
Its similar to incrementing div<<i times and cnt<<i. Somewhere we reach beyond dividend. So we store the count so far and repeat same till dividend>=divisor
Handle positive and negative integers and also MIN and MAX values.
dividend = 24  divisor =3
3<24 cnt=1 | 6<24 <cnt=2 |  9<24 cnt=3 ........ 24<=24 cnt=8 | 27<24 X
3<<1=6<24  cnt<<1=2 |  6<<1=12 cnt<<1 -> 2<<1 =4 | 12<<2=24  4<<1=8
24<<1=48>24 X  count =8.
if we have 25 instead of 24 we subtract 24 from 25 and start doing same and update count.