class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        return groupAnagramsOptimal(strs);
    }
      public List<List<String>> groupAnagramsOptimal(String[] strs) {
        if (strs == null) {
            return null;
        }
        HashMap<String, List<String>> hashMap = new HashMap<>();
        for (String s : strs) {
            char sorted[] = s.toCharArray();
            Arrays.sort(sorted);
            String afterSorted = new String(sorted);
            if (hashMap.containsKey(afterSorted)) {
                hashMap.get(afterSorted).add(s);
            } else {
                hashMap.put(afterSorted, new ArrayList<>(Collections.singleton(s)));
            }
        }
        List<List<String>> ans = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : hashMap.entrySet()) {
            ans.add(entry.getValue());
        }
        return ans;
    }
}
