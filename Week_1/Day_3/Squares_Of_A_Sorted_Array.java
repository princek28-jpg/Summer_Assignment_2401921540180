package Week_1.Day_3;

class Solution {
    public int[] sortedSquares(int[] nums) {
        int  n= nums.length;
        int [] sq= new int[n];
        int l=0;
        int r=n-1;
        for(int i=0;i<n;i++){
            if(Math.abs(nums[r])>Math.abs(nums[l])){
                sq[i]=nums[r]*nums[r];
                r--;
            }
            else{
                sq[i]=nums[l]*nums[l];
                l++;
            }
        }
        
        for(int i=0;i<n/2;i++){
            int temp=sq[i];
            sq[i]=sq[n-1-i];
            sq[n-1-i]=temp;
        }
        return sq;
    }
}
