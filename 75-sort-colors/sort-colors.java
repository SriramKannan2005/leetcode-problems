class Solution {
    public void sortColors(int[] nums) {
        int i=0;
        int j=0;
        for( i=0;i<nums.length-1;i++)
        {
            for( j=0;j<nums.length-i-1;j++){
            if(nums[j]>nums[j+1])
            {
               int temp=nums[j];
                nums[j]=nums[j+1];
                nums[j+1]=temp;
            }
        
        }
       
        
        }
        
    }
}