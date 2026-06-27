class Solution {
    public String convert(String s, int numRows) {

        if (numRows == 1) {
            return s;
        }

        StringBuilder[] arr = new StringBuilder[numRows];

        for (int i = 0; i < numRows; i++) {
            arr[i] = new StringBuilder();
        }

        int row = 0;
        int dir = 1;

        for (int i = 0; i < s.length(); i++) {

            arr[row].append(s.charAt(i));

            if (row == 0) {
                dir = 1;
            } else if (row == numRows - 1) {
                dir = -1;
            }

            row += dir;
        }

        String ans = "";

        for (int i = 0; i < numRows; i++) {
            ans += arr[i];
        }

        return ans;
    }
}