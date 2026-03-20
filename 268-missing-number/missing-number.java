class Solution {
    public int missingNumber(int[] nums) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int num:nums)
        {
            arr.add(num);
        }
        for(int i=0;i<=nums.length;i++)
        {
            if(!arr.contains(i))
            {
                return i;
            }
        }
        return -1;
        
    }
}