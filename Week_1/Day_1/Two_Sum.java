// Brute force approach

// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int n=nums.length;
//         int[] result=new int[2];
//         for(int i=0;i<n-1;i++){
//             for(int j=i+1;j<n;j++){
//                 if(nums[i]+nums[j]==target){
//                     result[0]=i;
//                     result[1]=j;
//                     break;
//                 }
//             }
//         }
//         return result;
//     }
// }

import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] result=new int[2];
        for(int i=0;i<nums.length;i++){
            int remained=target-nums[i];
            if(map.containsKey(remained)){
                result[0]=map.get(remained);
                result[1]=i;
            }
            map.put(nums[i],i);
        }
        return result;
    }
}