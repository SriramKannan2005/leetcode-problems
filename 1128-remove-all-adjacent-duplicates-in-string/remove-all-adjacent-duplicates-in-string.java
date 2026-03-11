class Solution {
    public String removeDuplicates(String s) {
        Stack<Character>st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray())
        {
            if(!st.isEmpty()&&st.peek()==c)
            {
                st.pop();
            }
            else{st.push(c);}
        }
        for(char c:st)
        {
            sb.append(c);
        }
        // sb.reverse();
        return sb.toString();
        
    }
}