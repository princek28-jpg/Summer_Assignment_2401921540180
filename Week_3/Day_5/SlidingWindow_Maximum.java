package Week_3.Day_5;

import java.util.*;

class Solution {

    public int[] maxSlidingWindow(int[] nums, int k) {

        Deque<Integer> q = new LinkedList<>();

        int[] res = new int[nums.length-k+1];

        int idx = 0;

        for(int i=0;i<nums.length;i++){

            // chhote remove
            while(!q.isEmpty() &&
                  q.peekLast() < nums[i]){

                q.removeLast();
            }

            q.add(nums[i]);

            // window complete
            if(i >= k-1){

                res[idx++] = q.peek();

                // agar front remove ho raha
                if(q.peek() == nums[i-k+1]){
                    q.remove();
                }
            }
        }

        return res;
    }
}
