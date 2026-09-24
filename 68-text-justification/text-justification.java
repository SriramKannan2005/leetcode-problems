class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {

        List<String> result = new ArrayList<>();
        int i = 0;

        while (i < words.length) {

            int j = i;
            int lineLength = 0;

            // Find how many words can fit
            while (j < words.length) {

                int required = lineLength + words[j].length();

                if (j > i) {
                    required += 1; // minimum space between words
                }

                if (required > maxWidth) {
                    break;
                }

                lineLength = required;
                j++;
            }

            int wordCount = j - i;
            boolean lastLine = j == words.length;

            StringBuilder line = new StringBuilder();

            // Last line or single-word line
            if (lastLine || wordCount == 1) {

                for (int k = i; k < j; k++) {
                    if (k > i) {
                        line.append(" ");
                    }
                    line.append(words[k]);
                }

                // Add remaining spaces
                while (line.length() < maxWidth) {
                    line.append(" ");
                }
            }

            // Fully justify
            else {

                // Total spaces that need to be distributed
                int totalSpaces = maxWidth;

                for (int k = i; k < j; k++) {
                    totalSpaces -= words[k].length();
                }

                int gaps = wordCount - 1;

                // Minimum spaces per gap
                int spaces = totalSpaces / gaps;

                // Extra spaces go to the left gaps
                int extra = totalSpaces % gaps;

                for (int k = i; k < j; k++) {

                    line.append(words[k]);

                    if (k < j - 1) {

                        int count = spaces;

                        if (extra > 0) {
                            count++;
                            extra--;
                        }

                        for (int x = 0; x < count; x++) {
                            line.append(" ");
                        }
                    }
                }
            }

            result.add(line.toString());

            i = j;
        }

        return result;
    }
}