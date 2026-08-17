class Solution {
    public char findTheDifference(String s, String t) {
        boolean[] used = new boolean[s.length()];

        for (int i = 0; i < t.length(); i++) {
            boolean found = false;

            for (int j = 0; j < s.length(); j++) {
                if (!used[j] && t.charAt(i) == s.charAt(j)) {
                    used[j] = true;
                    found = true;
                    break;
                }
            }

            if (!found) {
                return t.charAt(i);
            }
        }

        return ' ';
    }
}