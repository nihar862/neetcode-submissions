class Solution {
    public boolean isPalindrome(String s) {
        int l=0, r=s.length()-1;
        String t = s.toLowerCase();

        while(l<r) {
            if(!Character.isLetterOrDigit(t.charAt(l))) {
                l++;
                continue;
            }

            if(!Character.isLetterOrDigit(t.charAt(r))) {
                r--;
                continue;
            }

            if(t.charAt(l) != t.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
