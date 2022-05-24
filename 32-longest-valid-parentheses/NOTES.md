T:O(n^3)
---------------------------------------
Generate all possible substrings and check if it is a valid string and update the max length.
​
​
​
T:O(n)  S:O(N)
-----------------------------------------
Dp approach. For each character in the string, check if current is ) or (. If curr is ( fill the dp table with 0 since it is not valid till then. If it is a ) check if prev is ( if open uodate current with 2. Since () is a valid. If prev is also ) it means somewhere before there is a ( obtain the sofar value before i(curr) and do to particular index and check is contains ( and add 2 to the prev[i-1] value. Finally obtain the max of dp.
​
​
​
T:O(n)  S:O(N)
---------------------------------
Stack based approach. Initially store -1 in the stack. For each character push the corresponding index into the stack If curr char is ( . If curr in ) pop the index from stack i.e index of the last ( and update the max with curr ind - ind at top unless the stack is empty.
​
​
​
T:O(N)  S:(1)
-------------------------------------
Take two pointers initially pointing at 0 and for each char increment the i and j pointers for each ( and ). If both the pointers are equal at some point, update the max and reset i and j if j>i i.e )'s are greater than ('s. Do the same from left and right side and obtain the max of them.
​
​
