class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet <Integer> hs=new HashSet<>();
        for(int i: nums){
            hs.add(i);
        }
        int i=1;
        while(i!=1000){
            if(hs.contains(i*k)){
                i++;
            }
            else{
                return i*k;
            }
        }
        return -1;
        
    }
}