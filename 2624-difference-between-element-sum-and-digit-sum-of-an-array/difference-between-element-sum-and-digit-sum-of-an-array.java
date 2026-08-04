class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int elesum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while(nums[i]!=0){
                elesum+=nums[i]%10;
                nums[i]/=10;
            }
        }
        

        return sum-elesum;
    }
}