import java.util.*;

class Solution 
{
    public int[] finalPrices(int[] prices) 
    {
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0; i < prices.length; i++)
        {
            int top = prices[i];

            for(int j = i + 1; j < prices.length; j++)
            {
                if(prices[j] <= top)
                {
                    top = top - prices[j];
                    break;
                }
            }

            st.push(top);
        }

        for(int c : st)
        {
            arr.add(c);
        }

        int[] result = new int[arr.size()];
        for(int i = 0; i < arr.size(); i++)
        {
            result[i] = arr.get(i);
        }

        return result;
    }
}