class Solution {
    public int calPoints(String[] operations) {
        List<Integer> l=new ArrayList<>();
        int k=0;
        for(String ch : operations){
            if (!ch.equals("+") && !ch.equals("C") && !ch.equals("D")){
                l.add(Integer.valueOf(ch));
                k++;
            }
            else if (ch.equals("C")){
                l.remove(--k);
            }
            else if(ch.equals("+")){
                l.add(l.get(k-1)+l.get(k-2));
                k++;
            }
            else{
                l.add(l.get(k-1)*2);
                k++;
            }
        }
        int sum=0;
        for(int i:l){
            sum+=i;
        }
        return sum;
    }
}