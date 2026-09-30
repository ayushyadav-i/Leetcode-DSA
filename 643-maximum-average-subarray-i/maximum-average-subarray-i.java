class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        int s=0,e=k;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        double avg=sum/k;
        for(int i=k;i<nums.length;i++){
            sum+=nums[i];
            sum-=nums[i-k];
            double avg2=sum/k;
            avg=Math.max(avg,avg2);
        }
        return avg;    
    }
}