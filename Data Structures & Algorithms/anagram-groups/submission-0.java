class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> ans = new ArrayList<>();

        if (strs.length == 0) {
            return ans;
        }

        boolean[] visited = new boolean[strs.length];

        for (int i = 0; i < strs.length; i++) {

            if (visited[i]) {
                continue;
            }

            visited[i] = true;

            List<String> group = new ArrayList<>();
            group.add(strs[i]);

            HashMap<Character, Integer> hashMap = new HashMap<>();

            for (char ch : strs[i].toCharArray()) {
                hashMap.put(ch, hashMap.getOrDefault(ch, 0) + 1);
            }

            for (int j = i + 1; j < strs.length; j++) {

                if (visited[j]) {
                    continue;
                }

                HashMap<Character, Integer> hashMap1 = new HashMap<>();

                for (char ch : strs[j].toCharArray()) {
                    hashMap1.put(ch, hashMap1.getOrDefault(ch, 0) + 1);
                }

                if (hashMap.equals(hashMap1)) {
                    group.add(strs[j]);
                    visited[j] = true;
                }
            }

            ans.add(group);
        }

        return ans;
    }
}