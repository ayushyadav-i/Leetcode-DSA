class Solution {
    public String reverseOnlyLetters(String st) {
        char[] ch=st.toCharArray();
        int s=0,l=st.length()-1;
        while(s<l){
            if(!((ch[s]>='a' && ch[s]<='z') || (ch[s]>='A' && ch[s]<='Z'))){
                s++;
            }
         else if(!((ch[l]>='a' && ch[l]<='z') || (ch[l]>='A' &&  ch[l]<='Z'))){
                l--;
            }
            else{
                char temp=ch[s];
                ch[s]=ch[l];
            ch[l]=temp;
            s++;
            l--;
            }


        }
        return new String(ch);
    }
}