O(N^2)
-------------------------------
Take two pointers i and j where j>i (two loops and j running from i+1) and keep track of index at which nums[j]<nums[i] and update max and min. Return max-min+1.
​
​
O(Nlog N)
-------------------------------
Sort the array and compare the sorted with the original one. If at any point the element does not match keep track of the index at which the element does not match. Get the maximum and minimum index at which the elements does not match and return max-min+1.
​
T: O(N) -> S:O(N)
-------------------------------
Keep pushing the element's indices into the stack till elements are in increasing order. If the st.peek() > nums[i] pop the indices from stack and update min index till st.peek()<nums[i]. Now empty the stack and do same from right side of the array and obtain the max index and return the max-min+1.
​
T:O(N)   -> S:O(1)
-------------------------------
Traverse the array and get nums[i] where the elements are not in incresing order. Similarly traverse from back till the elements are not in decresing order and obtains the elements. Now traverse again with the obtained elements and fin the actual index where the element to be placed by comparing with the order and return r-l+1.
​
2 6 4 8 10 9 15
2<6>4 --> store 4 as min
15>9<10 --> store 10 as max
​
compare with the existing elements to find the elements inserted position
​
2<4  6>4 --> insert 4 at element 6 position and store its position.
10<15  10>9 -->insert 10 at element 9 position and store its position.
​
​
​
​
​
​
​