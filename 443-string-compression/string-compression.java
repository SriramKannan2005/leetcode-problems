class Solution {
    public int compress(char[] chars) {

        String s = new String(chars);

        StringBuilder sb = new StringBuilder();

        int count = 1;

        for(int i = 0; i < s.length(); i++) {

            if(i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                count++;
            }
            else {

                sb.append(s.charAt(i));

                if(count > 1) {
                    sb.append(count);
                }

                count = 1;
            }
        }

        for(int i = 0; i < sb.length(); i++) {
            chars[i] = sb.charAt(i);
        }

        return sb.length();
    }
}