class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)return false;
        int num=0,temp=x;
        while(temp!=0){
            num*=10;
            num+=temp%10;
            temp/=10;
        }
        return x==num;    
    }
}