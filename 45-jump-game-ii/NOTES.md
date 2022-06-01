Brute
-------------------------------------
For each index check from which index we can reach curr with minimum steps. i.e start from index 0 and i<curr_ind check if we can reach curr_ind and update the min to reach curr. Finally check if we can reach last index.
​
​
​
​
Optimal
---------------------------------------------
We start with index 1 assuming we have already had a jump with nums[0] current jump_steps_power i.e we had a jump to index zero and we can jump nums[0] steps more which is our max_jump_power. At each index decerement the max_jump_power and also update the max_power we can obtain at each index. If our jump_power reaches 0, it means we need an extra jump. So update the jump count++ and we need to update our max_jump_power with the max_power so far we obtained. Since we obtained max_power at some index and we are using it now i.e we have already passed few indices after obtaining the max_power. So we update max_power with max_power-curr_ind and update our max_jump_power with it.