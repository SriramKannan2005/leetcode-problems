class Solution {
    public String makeGood(String s) {
        StringBuilder sb=new StringBuilder(s);
        if(s.length()<=1)
        {
            return s;
        }
        for(int i=0;i<sb.length()-1;i++)
        {
            int difference=sb.charAt(i)-sb.charAt(i+1);
            if(difference==32||difference==-32)
            {
                sb.deleteCharAt(i);
                sb.deleteCharAt(i);
                return makeGood(sb.toString());
            }
        }
       
        return sb.toString();
    }
}