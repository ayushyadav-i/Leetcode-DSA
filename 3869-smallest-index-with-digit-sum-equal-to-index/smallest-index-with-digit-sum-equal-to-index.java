class Solution {
    public int smallestIndex(int[] nums) {
        int c=0;
        for(int i:nums){
            int sum=0;
            while(i != 0){
                sum += i%10;
                i=i/10;
            }
            if(sum==c){
                return c;
            }
            c++;
        }
        return -1;   
    }
}