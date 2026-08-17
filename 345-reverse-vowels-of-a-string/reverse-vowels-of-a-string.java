class Solution {
    public String reverseVowels(String s) {
        
        // Store only vowels
        ArrayList<Character> arr = new ArrayList<>();
        
        for (char ch : s.toCharArray()) {
            if (isVowel(ch)) {
                arr.add(ch);
            }
        }
        
        // Reverse the vowels
        Collections.reverse(arr);
        
        // Convert string into character array
        char[] result = s.toCharArray();
        
        // Replace vowels with reversed vowels
        int j = 0;
        
        for (int i = 0; i < result.length; i++) {
            if (isVowel(result[i])) {
                result[i] = arr.get(j);
                j++;
            }
        }
        
        return new String(result);
    }
    
    public boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' ||
               ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' ||
               ch == 'O' || ch == 'U';
    }
}