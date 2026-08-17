class Solution {
    public void reverseString(char[] s) {
        ArrayList<Character> arr=new ArrayList<>();
        for(char ch:s)
        {
            arr.add(ch);
        }
        Collections.reverse(arr);
        
        for(int i=0;i<arr.size();i++)
        {
            s[i]=arr.get(i);
        }
        
        
    }
}