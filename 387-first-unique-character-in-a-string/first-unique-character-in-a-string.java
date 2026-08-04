class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        char p[]=s.toCharArray();
        for(char ch:p){
            if(!hm.containsKey(ch)){
                hm.put(ch,1);
            }
            else{
                hm.put(ch,hm.get(ch)+1);
            }
        }
        int r=0;
        for(char ch:p){
            if(hm.get(ch)==1){
                return r;

            }
            r++;
        }
        return -1;

        
    }
}