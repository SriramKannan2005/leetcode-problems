class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates,target,result,temp,0);
        return result;
        
    }
    public void backtrack(int [] candidates,int target, List<List<Integer>> result,List<Integer> temp,int start)
    {
        if(target==0)
        {
            result.add(new ArrayList<>(temp));
            return;
        }
        if(target<0)
        {
            return;
        }
        for(int i=start;i<candidates.length;i++)
        {
            if(i>start && candidates[i] == candidates[i-1])
            {
               continue;
            }
            temp.add(candidates[i]);
            // target=target-candidates[i];
            // backtrack(candidates,target;,result,temp,i);
            backtrack(candidates,target-candidates[i],result,temp,i+1);
            // target=target+candidates[i];
            temp.remove(temp.size()-1);
        }
    }
}