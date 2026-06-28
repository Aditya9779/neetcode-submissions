class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        return groupAnagramsBest(strs);
    }
    public List<List<String>> groupAnagramsBest(String[] strs) {
        HashMap<String, List<String>> hashMap = new HashMap<>();
        for (String s : strs) {
            int[] frequency = new int[26];
            for (char c : s.toCharArray()) {
                frequency[c - 'a']++;
            }
            if (hashMap.containsKey(Arrays.toString(frequency))) {
                hashMap.get(Arrays.toString(frequency)).add(s);
            } else {
                hashMap.put(Arrays.toString(frequency), new ArrayList<>(Collections.singleton(s)));
            }
        }
        return new ArrayList<>(hashMap.values());

    }
}
