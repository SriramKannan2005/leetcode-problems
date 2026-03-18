class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        int j=0;
        // for( i=0;i<nums.length-1;i++)
        // {
        // //     for(int j=i;j<nums.length-1;j++){
        // //     if(nums[j]==0)
        // //     {
        // //        int temp=nums[j];
        // //         nums[j]=nums[j+1];
        // //         nums[j+1]=temp;
        // //     }
        // // 
        // }
       
          
        
        int n=nums.length;
        if(n==0||n==1)
        {
            return;
        }
        for (i = 0; i < n; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        
        }
       
        
        
    }
}