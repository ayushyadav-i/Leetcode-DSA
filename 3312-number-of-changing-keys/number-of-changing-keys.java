class Solution {
    public int countKeyChanges(String s) {
        s=s.toLowerCase();
        char arr[]=s.toCharArray();
        int c=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]!=arr[i]){
                c++;
            }
        }
        return c;
    }
}