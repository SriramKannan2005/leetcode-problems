class Solution {
    public boolean isNumber(String s) {

        boolean digit = false;
        boolean dot = false;
        boolean exponent = false;
        boolean exponentDigit = true;

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            // Digit
            if (Character.isDigit(c)) {
                digit = true;

                if (exponent) {
                    exponentDigit = true;
                }
            }

            // Decimal point
            else if (c == '.') {

                // Dot is not allowed after exponent
                // and only one dot is allowed
                if (dot || exponent) {
                    return false;
                }

                dot = true;
            }

            // Exponent
            else if (c == 'e' || c == 'E') {

                // Only one exponent
                // and number must exist before exponent
                if (exponent || !digit) {
                    return false;
                }

                exponent = true;
                exponentDigit = false;
            }

            // Sign
            else if (c == '+' || c == '-') {

                // Sign is valid only at the beginning
                // or immediately after e/E
                if (i != 0 &&
                    s.charAt(i - 1) != 'e' &&
                    s.charAt(i - 1) != 'E') {
                    return false;
                }
            }

            // Anything else is invalid
            else {
                return false;
            }
        }

        return digit && exponentDigit;
    }
}
