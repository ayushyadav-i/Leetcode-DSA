class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer> ans= new ArrayList<>();
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]!=nums[i]){
                int k=nums[i-1]+1;
                while(k<nums[i]){
                    ans.add(k);
                    k++;
                }
            }
        }
        return ans;


        
    }
}