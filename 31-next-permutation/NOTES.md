If the array is sorted in descending order we return the ascending order of arrray.
Initially for each index i from the end of array we search if there is any number lesser than the current prior to that index. I so we simply swap the element at j and sort the array from j+1 to endof array
​
[1 4 5 2 3] -> 5>4 so we swap 5{i=2} and 4{j=1} and sort from j+1