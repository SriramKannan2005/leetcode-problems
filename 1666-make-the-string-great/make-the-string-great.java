class Solution {
    public String makeGood(String s) {
        StringBuilder sb=new StringBuilder(s);
        if(s.length()<=1)
        {
            return s;
        }
        for(int i=0;i<sb.length()-1;i++)
        {
            int difference=sb.charAt(i)-sb.charAt(i+1);
            if(difference==32||difference==-32)
            {
                sb.deleteCharAt(i);
                sb.deleteCharAt(i);
                return makeGood(sb.toString());
            }
        }
       
        return sb.toString();
    }
}
// class Solution {
//     public String makeGood(String s) {
//         Stack<Character> st = new Stack<>();
//         for(char c : s.toCharArray())
//         {
//             if(!st.isEmpty() && Math.abs(st.peek()-c)==32)
//             {
//                 st.pop();
//             }
//             else
//             {
//                 st.push(c);
//             }
//         }
//         StringBuilder sb = new StringBuilder();
//         for(char c : st)
//         {
//             sb.append(c);
//         }
//         return sb.toString();
//     }
// }