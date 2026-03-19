class Solution {
    public boolean containsDuplicate(int[] nums) {
         Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
                return true;
        }
        else
        {
            map.put(nums[i],1);
        }
        }
        return false;
    }
}