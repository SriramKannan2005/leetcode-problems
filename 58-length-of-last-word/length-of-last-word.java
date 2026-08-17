class Solution {
    public int lengthOfLastWord(String s) {

        String[] ar=s.split(" ");
        String res=ar[ar.length-1];
        return res.length();
        
    }
}