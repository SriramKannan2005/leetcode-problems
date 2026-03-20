class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String rev="";
        String org="";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
           char  ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch) )
            {
                sb.append(s.charAt(i));
            
            }
        }
        org=sb.toString();
        rev=sb.reverse().toString();
        if(org.equals(rev))
        {
            return true;
        }
        return false;

        
    }
}