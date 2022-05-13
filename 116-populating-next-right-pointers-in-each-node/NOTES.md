Get the level order traversal and start pointing level wise to its right most nodes. Return the root of the tree
​
Optimised
---------------------------------------
Since it is guaranteed that each node has two children, At each level we start with the left most node and point the left of curr to the right of current and right of curr to the next.left of curr if next!=null. There is no need to point the right of last node to null since it is already point to null.