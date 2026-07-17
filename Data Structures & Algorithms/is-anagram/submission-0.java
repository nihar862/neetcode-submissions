class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> st = new HashMap<>();
        int n = s.length();
        int m = t.length();

        if(n != m) {
            return false;
        }

        for(int i=0; i<n; i++) {
            st.merge(s.charAt(i), 1, Integer::sum);
        }

        for(int j=0; j<m; j++) {
            st.merge(t.charAt(j), -1, Integer::sum);

            if(st.get(t.charAt(j)) < 0) {
                return false;
            }
        }

        return true;


    }
}
