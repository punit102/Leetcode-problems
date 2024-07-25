// Note: Second HashMao which is TreeMap - Adding 1 and substracting 1 is very import

class StockPrice {

    private HashMap<Integer, Integer> mapOfTimeAndPrice;
    private TreeMap<Integer, Integer> treemapOfPriceAndCount;
    private int latestTime;

    public StockPrice() {
        this.latestTime = 0;
        this.mapOfTimeAndPrice = new HashMap<>();
        this.treemapOfPriceAndCount = new TreeMap<>();
    }

    public void update(int timestamp, int price) {
        latestTime = Math.max(latestTime, timestamp);

        if (mapOfTimeAndPrice.containsKey(timestamp)) {
            int oldPrice = mapOfTimeAndPrice.get(timestamp);
            treemapOfPriceAndCount.put(oldPrice, treemapOfPriceAndCount.get(oldPrice) - 1);

            if (treemapOfPriceAndCount.get(oldPrice) == 0) {
                treemapOfPriceAndCount.remove(oldPrice);
            }
        }

        // Add new entry in HashMap
        mapOfTimeAndPrice.put(timestamp, price);
        // Add new entry in TreeMap
        treemapOfPriceAndCount.put(price, treemapOfPriceAndCount.getOrDefault(price, 0) + 1);

    }

    public int current() {
        return mapOfTimeAndPrice.get(latestTime);
    }

    public int maximum() {
        return treemapOfPriceAndCount.lastKey();
    }

    public int minimum() {
        return treemapOfPriceAndCount.firstKey();
    }
}

/**
 * Your StockPrice object will be instantiated and called as such:
 * StockPrice obj = new StockPrice();
 * obj.update(timestamp,price);
 * int param_2 = obj.current();
 * int param_3 = obj.maximum();
 * int param_4 = obj.minimum();
 */