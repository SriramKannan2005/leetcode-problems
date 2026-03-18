class Solution {
    public boolean isAnagram(String s, String t) {
        char[]sarr=s.toCharArray();
        char[]tarr=t.toCharArray();
        Arrays.sort(sarr);
        Arrays.sort(tarr);
        String s1=new String(sarr);
        String t1=new String(tarr);
        if(s1.equals(t1))
        {
            return true;
        }
        return false;
    }
}