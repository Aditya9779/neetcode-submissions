
  class Solution {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        if (nums == null || nums.length < 3) {
            return ans;
        }

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {

            // Skip duplicate first elements
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int start = i + 1;
            int end = nums.length - 1;

            while (start < end) {
                int sum = nums[i] + nums[start] + nums[end];

                if (sum < 0) {
                    start++;
                } else if (sum > 0) {
                    end--;
                } else {
                    ans.add(Arrays.asList(
                        nums[i],
                        nums[start],
                        nums[end]
                    ));

                    start++;
                    end--;

                    // Skip duplicate start values
                    while (start < end &&
                           nums[start] == nums[start - 1]) {
                        start++;
                    }

                    // Skip duplicate end values
                    while (start < end &&
                           nums[end] == nums[end + 1]) {
                        end--;
                    }
                }
            }
        }

        return ans;
    }
}
