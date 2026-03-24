class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1=new HashSet<>();
        for(Integer a:nums1){
            s1.add(a);
        }
        Set<Integer> s2=new HashSet<>();
        for(Integer b:nums2){
           if(s1.contains(b)){
            s2.add(b);
           }
        }
        int[] ans = new int[s2.size()];
        int i=0;
        for(int val:s2){
            ans[i++]=val;
        }
        return ans;
    }
}
