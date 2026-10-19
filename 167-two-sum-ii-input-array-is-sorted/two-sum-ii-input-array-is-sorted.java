class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] a={0,0};
        int s=0,l=numbers.length-1;
        while(s<l){
            if(numbers[s]+numbers[l]==target){
                a[0]=s+1;
                a[1]=l+1;
                return a;
            }
            if(numbers[s]+numbers[l]>target) l--;
            else s++;
        }
        return a;
        
    }
}