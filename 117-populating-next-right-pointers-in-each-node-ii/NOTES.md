Do BFS and maintain a prev pointer as currentlty popped element and mark next of curr as prev and update prev as curr. Initially prev will be null so handle this case.



#Opti

We place our dummy node at each level and we take the reference of dummy node and attach each node with the next of dummy ref checking if left and right node exists. After completing each level we update the curr node position at next level by marking head node at next of dummy since we already updated dummy using dummy ref.
