class Solution {
    public String getPermutation(int n, int k) {

        // Store available numbers
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            numbers.add(i);
        }

        // Factorials
        int[] fact = new int[n + 1];
        fact[0] = 1;

        for (int i = 1; i <= n; i++) {
            fact[i] = fact[i - 1] * i;
        }

        // k is 0-based
        k--;

        StringBuilder ans = new StringBuilder();

        for (int i = n; i >= 1; i--) {

            // Find which block contains kth permutation
            int index = k / fact[i - 1];

            ans.append(numbers.get(index));

            // Remove selected number
            numbers.remove(index);

            // Move inside that block
            k = k % fact[i - 1];
        }

        return ans.toString();
    }
}
