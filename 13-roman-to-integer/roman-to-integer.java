class Solution {
    public int romanToInt(String s) {

        Map<Character, Integer> romanMap = new HashMap<>();

        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        char[] ch = s.toCharArray();
        int sum = 0;

        for (int i = 0; i < ch.length; i++) {
            if (romanMap.containsKey(ch[i])) {

                if (i < ch.length - 1 &&
                    romanMap.get(ch[i]) < romanMap.get(ch[i + 1])) {

                    sum -= romanMap.get(ch[i]);

                } else {

                    sum += romanMap.get(ch[i]);
                }
            }
        }

        return sum;
    }
}