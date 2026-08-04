class Solution {
    public int countDigits(int num) {
        int k=num,c=0;
        while(k!=0){
            if(num%(k%10)==0){
                c++;
            }
            k/=10;
        }
        return c;
        
    }
}