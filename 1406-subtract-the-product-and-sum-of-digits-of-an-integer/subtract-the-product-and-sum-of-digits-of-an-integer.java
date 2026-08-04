class Solution {
    public int subtractProductAndSum(int n) {
        int k=n;
        int var=1;
        int var2=0;
        while(k!=0){
            var*=k%10;
            k=k/10;
        }
        k=n;
         while(k!=0){
            var2+=k%10;
            k=k/10;
        }
        return var-var2;

        
    }
}