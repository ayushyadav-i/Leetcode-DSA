class Solution {
    public int subarraySum(int [] nums, int k ){
        HashMap <Integer,Integer> hs= new HashMap<>();
        int count=0;
        hs.put(0,1);
        int sum=0;
        for(int i:nums){
            sum+=i;
            if(hs.containsKey(sum-k)){
                count+=hs.get(sum-k);
            }
            if(hs.containsKey(sum)){
                hs.put(sum,hs.get(sum)+1);
            }
            else{
                hs.put(sum,1);
            }
        }
        return count;
        }
    }
    // public int subarraySum(int[] nums, int k) {
    //     int max=0;
    //     for(int i=0;i<nums.length;i++){
    //         int sum=0;
    //         for(int j=i;j<nums.length;j++){
    //             sum+=nums[j];
    //             if(sum==k){
    //                 max++;  
    //             }
    //             if(sum>k){
    //                 continue;
    //             }
    //         }
    //     }
    //     return max;
        
    // }
