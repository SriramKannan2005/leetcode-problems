import java.util.*;

class Solution {

    static class Pair {
        int node;
        int cost;
        int stops;

        Pair(int node, int cost, int stops) {
            this.node = node;
            this.cost = cost;
            this.stops = stops;
        }
    }

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {

        List<List<Pair>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++)
            graph.add(new ArrayList<>());

        for (int[] f : flights)
            graph.get(f[0]).add(new Pair(f[1], f[2], 0));

        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a, b) -> a.cost - b.cost
        );

        int[][] dist = new int[n][k + 2];
        for (int i = 0; i < n; i++)
            Arrays.fill(dist[i], Integer.MAX_VALUE);

        pq.offer(new Pair(src, 0, 0));
        dist[src][0] = 0;

        while (!pq.isEmpty()) {
            Pair curr = pq.poll();
            int node = curr.node;
            int cost = curr.cost;
            int stops = curr.stops;

            if (node == dst)
                return cost;

            if (stops > k)
                continue;

            for (Pair nei : graph.get(node)) {
                int next = nei.node;
                int price = nei.cost;

                if (cost + price < dist[next][stops + 1]) {
                    dist[next][stops + 1] = cost + price;
                    pq.offer(new Pair(next, cost + price, stops + 1));
                }
            }
        }

        return -1;
    }
}
