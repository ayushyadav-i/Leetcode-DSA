class Solution {
    public boolean validPalindrome(String s) {
        int b = 0;
        int l = s.length() - 1;
        
        while (b < l) {
            if (s.charAt(b) != s.charAt(l)) {
                return isPalindrome(s, b + 1, l) || isPalindrome(s, b, l - 1);
            }
            b++;
            l--;
        }
        return true;
    }
    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
