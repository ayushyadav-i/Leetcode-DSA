class Solution {
    public boolean check(int[] nums) {
        int min=nums[0],c=0,l=nums.length;
        for (int i=1;i< l;i++){
            if(min>nums[i]){
            min=nums[i];
            c=i;
            }
        }
        
        if(nums[0]==nums[l-1] && nums[0]==min) {
           c=l-1;
        }
        if(l-2!=-1 && nums[l-1]==nums[l-2] && nums[0]==min ){
           c=l-2;
        }

        int j=c;
        if(c==0){
           while(c<l-1){
            if(nums[c]>nums[c+1]){
                return false;
            }
            c=c+1;
           }
           return true;
        }
        else{
        while(c<l-1){
            if(nums[c]>nums[c+1]){
                return false;
            }
            c=c+1;
        }}
        if( nums[0]<nums[l-1] && nums[0]!=nums[l-1]){
            return false;
        }
        for(int t=0;t<j-1;t++){
            if(nums[t]>nums[t+1]){
                return false;
            }
        }
        return true;


    }
}