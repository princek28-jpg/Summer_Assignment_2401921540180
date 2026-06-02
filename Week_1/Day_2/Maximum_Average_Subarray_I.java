package Week_1.Day_2;

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        double maxs=sum;
        for(int i=k;i<n;i++){
            sum=sum-nums[i-k]+nums[i];
            maxs=Math.max(sum,maxs);
        }
        return maxs/k;
    }
}
