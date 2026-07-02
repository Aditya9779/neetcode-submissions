class Solution {
       public int longestConsecutive(int[] nums) {
        //{ index,value of array}
        HashSet<Integer> hashSet = new HashSet<>();
        int length = 0, ans = 0;
        for (int x : nums) hashSet.add(x);
        for (int x : hashSet) {
            if (!hashSet.contains(x - 1)) {
                int current = x;
                length = 1;
                while (hashSet.contains(current + 1)) {
                    current++;
                    length++;
                }
                ans = Math.max(length, ans);
            }
        }
        return ans;
    }
}
