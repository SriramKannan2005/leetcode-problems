import java.util.*;
import java.util.stream.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        // Step 1: Convert array into stream and group by sorted key
        Map<String, List<String>> map =
                Arrays.stream(strs)
                      .collect(Collectors.groupingBy(word -> {
                          char[] ch = word.toCharArray();
                          Arrays.sort(ch);
                          return new String(ch);   // key
                      }));

        // Step 2: Return grouped values
        return new ArrayList<>(map.values());
    }
}