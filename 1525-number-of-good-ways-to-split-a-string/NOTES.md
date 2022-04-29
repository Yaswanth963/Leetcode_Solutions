Take prefix and suffix array at each index store the number of distinct characters to the left and right in both prefix and suffix arrays.
​
check if prefix[i]==sufix[i+1] and increment ans
​
​
​
We can use map and set to keep track of the distinct characters so far on left and right.
Traverse each character add it in the set remove it from map and compare both sizes.