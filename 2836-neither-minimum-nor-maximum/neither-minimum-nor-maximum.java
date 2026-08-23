class Solution {
    public int findNonMinOrMax(int[] nums) {
        if(nums.length<3){
            return -1;
        }
        int min=Math.min(nums[0],nums[1]);
        int max=Math.max(nums[0],nums[2]);
        for(int i=0;i<nums.length;i++){
            if(nums[i]<max && nums[i]>min){
                return nums[i];
            }
            if(nums[i]<min){
                if(min< max){
                    return min;
                }
                else{
                    min=nums[i];
                }
            }
            if(nums[i]>max){
                if(min< max){
                    return max;
                }
                else{
                    max=nums[i];
                }
            }

        }
        return -1;
    }
}