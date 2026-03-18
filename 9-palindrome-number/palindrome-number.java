class Solution {
    public boolean isPalindrome(int x) {
        int org=x;
        int xNew=0;
        if(x<0)
        {
            return false;
        }
        while(x!=0)
        {
            int temp=x%10;
          xNew=(xNew*10)+temp; 
          x=x/10; 
        }
       return org==xNew;
    }
}