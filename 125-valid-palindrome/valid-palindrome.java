class Solution {
    public boolean isPalindrome(String s) {
        int b = 0, l = s.length() - 1;
        
        while (b < l) {
            while (b < l && !Character.isLetterOrDigit(s.charAt(b))) {
                b++;
            }
            while (b < l && !Character.isLetterOrDigit(s.charAt(l))) {
                l--;
            }
            if (Character.toLowerCase(s.charAt(b)) != Character.toLowerCase(s.charAt(l))) {
                return false;
            }  
            b++;
            l--;
        }
        return true;    
    }
}
