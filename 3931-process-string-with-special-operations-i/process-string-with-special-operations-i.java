class Solution {
    public String processStr(String s) {
        StringBuilder b = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(Character.isLowerCase(ch))
            {
                b.append(ch);
            }
            else if(ch=='#')
            {
                b.append(b);
            }
            else if(ch=='%')
            {
                b.reverse();
            }
            else if(ch=='*' && b.length()!=0)
            {
                b.deleteCharAt(b.length()-1); 
            }
        }
        return b.toString(); 
    }
}