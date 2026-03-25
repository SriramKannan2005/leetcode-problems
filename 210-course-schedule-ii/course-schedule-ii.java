class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj= new ArrayList<>();
        int count=0;
        for(int i=0;i<numCourses;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int[] edge:prerequisites)
        {
            adj.get(edge[1]).add(edge[0]);
        }
     int[] indegree = new int[numCourses];
     for(int i=0;i<numCourses;i++)
     {
         for(int n:adj.get(i))
         {
             indegree[n]++;
         }
     }
     Queue<Integer> q= new LinkedList<>();
     for(int i=0;i<numCourses;i++)
     {
         if(indegree[i]==0)
         {
             q.add(i);
         }
     }
      ArrayList<Integer>res=new ArrayList<>();
     while(!q.isEmpty())
     {
         int vertex=q.poll();
         count++;
         res.add(vertex);
         for(int neighbour:adj.get(vertex))
         {
             indegree[neighbour]--;
             if(indegree[neighbour]==0)
             {
                 q.add(neighbour);
             }
         }
         
     }
     // using manual way of converrting the arraylist to the array using for loop;
       int [] result=new int [res.size()];
     for(int i=0;i< res.size();i++)
     {
        result[i]=res.get(i);
     }
     return count!= numCourses ? new int [0]: result;
    }
}