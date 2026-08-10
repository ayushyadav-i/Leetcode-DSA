class Solution {
    public boolean winnerSquareGame(int n) {
        Boolean[] t=new Boolean[n+1];
        return solve(n,t);
        
    }
    public boolean solve(int n,Boolean[] t){
        if(n==0){
            return false;
        }
        if (t[n] != null) {
    return t[n];
}
        for(int k=1;k*k<=n;k++){
            if(solve(n-(k*k),t)==false){
                return t[n]=true;
            }
        }
        return t[n]=false;
    }
}