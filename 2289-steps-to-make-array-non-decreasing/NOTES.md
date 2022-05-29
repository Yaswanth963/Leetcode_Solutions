Brute
---------------------------------
Remove all the elements where a[i]<a[i-1]. Do till we dont have further numbers to remove.
Time will be exponential since for each number we are traversing n elements.
​
​
​
Opti
----------------------------------
The idea is to find the prev greater element for each index i and update the distance between them and get the max distance of all.  This works because each element a[i] will not get removed till there is an element left to it that is greater than a[i]. So a[i] will be removed at ith iteration which is the distance between curr element and prev greater element to it. This is applicable for each element. So we get the max distance of all.
​
For each element in a stack we store nums[i] and the distance between curr and next greater. On each pop we increment the count because, count reprsents number of time we are removing the smaller elements.
​
Since we need to find prev greater in increasing monotonic stack(as stated in the question array should be non-decreasing) we need to traverse the array from right to left.
​
​
​
​
​
Decreasing monotonic stack
----------------------------------------
prev_greater -> left to right traverse
next_greater-> right to left traverse
​
​
​
​
​
Increasing monotonic stack
-------------------------------------
next_greater -> left to right traverse
prev_greater-> right to left traverse
​