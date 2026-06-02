package Week_1.Day_2;

class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int sum=nums[0];
        int maxs=nums[0];
        for(int i=1;i<n;i++){
            sum=Math.max(nums[i],nums[i]+sum);
            maxs=Math.max(maxs,sum);
        }
        return maxs;
    }
}