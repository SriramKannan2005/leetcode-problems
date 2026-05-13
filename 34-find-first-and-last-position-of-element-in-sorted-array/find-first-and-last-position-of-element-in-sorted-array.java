class Solution {
    public int[] searchRange(int[] nums, int target) {

        ArrayList<Integer> list = new ArrayList<>();

        // convert array to ArrayList
        for (int num : nums) {
            list.add(num);
        }

        // target not present
        if (!list.contains(target)) {
            return new int[]{-1, -1};
        }

        // first occurrence
        int first = list.indexOf(target);

        // remove first occurrence
        list.remove(first);

        int last;

        // check again
        if (list.contains(target)) {

            // index after removal
            last = list.lastIndexOf(target) + 1;

        } else {

            last = first;
        }

        return new int[]{first, last};
    }
}