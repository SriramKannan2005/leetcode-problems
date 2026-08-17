class Solution {
    boolean found;
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0)
            return true;

        int j = 0;

        for (int i = 0; i < s.length(); i++) {

            found = false;

            for (; j < t.length(); j++) {

                if (s.charAt(i) == t.charAt(j)) {
                    found = true;
                    j++;
                    break;
                }
            }

           

        
    }
    return found;
}
}