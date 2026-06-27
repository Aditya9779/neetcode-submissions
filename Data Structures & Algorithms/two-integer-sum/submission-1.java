class Solution {
     public int[] twoSum(int[] nums, int target) {
        if (nums == null) {
            return null;
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        int k ;
        for (int i = 0; i <nums.length ; i++) {
            k=target-nums[i];
            if(map.containsKey(k)){
                return new int[]{map.get(k),i};
            }else {
                map.put(nums[i],i);
            }
        }
        return null;
    }
}
