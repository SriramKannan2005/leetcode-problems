class Solution {
    public int firstUniqChar(String s) {
         int a=1;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            boolean repeated = false;

            for (int j = 0; j < s.length(); j++) {
                if (i != j && ch == s.charAt(j)) {
                    
                         repeated = true;
                         break;
                    

                    
                   
                    
                }
            }

            if (repeated==false) {
               return i;
                
            }
        }

        return -1;
        
    }
}