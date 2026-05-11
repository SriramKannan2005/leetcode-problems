class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer>winner=new LinkedList<>();
        for(int i=1;i<=n;i++){
            winner.add(i);
        }
        int startindex=0;
        while(winner.size()>1){
            int delindex=(startindex+(k-1))% winner.size();
            winner.remove(delindex);
            startindex = delindex;
        }
        return winner.getFirst();
    }
}