class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> hs = new HashMap<>();

        for(int i=0; i<strs.length; i++) {
            String str = strs[i];
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            
            hs.computeIfAbsent(key, k-> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(hs.values());
    }
}
