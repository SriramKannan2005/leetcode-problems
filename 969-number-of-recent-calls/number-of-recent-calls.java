class RecentCounter {

    ArrayList<Integer> list;

    public RecentCounter() {
        list = new ArrayList<>();
    }
    
    public int ping(int t) {

        list.add(t);

        int count = 0;

        for(int i = 0; i < list.size(); i++) {

            if(list.get(i) >= t - 3000) {
                count++;
            }
        }

        return count;
    }
}