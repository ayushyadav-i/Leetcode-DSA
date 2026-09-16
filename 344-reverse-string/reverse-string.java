class Solution {
    public void reverseString(char[] s) {
        int b=0,l=s.length-1;
        while(b<l){
            char t=s[b];
            s[b]=s[l];
            s[l]=t;
            l--;b++;
        }
        
    }
}