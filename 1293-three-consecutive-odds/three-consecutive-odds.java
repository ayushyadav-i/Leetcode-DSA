class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int i=0;
        int c=0;
        while(i<arr.length){
            if(arr[i++]%2==0){
                c=0;
            }
            else{
                c++;
            }
            if(c==3){
                return true;
            }
        }
        return false;
        
    }
}