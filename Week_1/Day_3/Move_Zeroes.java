package Week_1.Day_3;

class Solution {
    public void moveZeroes(int[] nums) {
        int temp;
        int l=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                temp=nums[i];
                nums[i]=nums[l];
                nums[l]=temp;
                l++;
            }
        }
    }
}
