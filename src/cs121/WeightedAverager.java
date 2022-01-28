package cs121;

public class WeightedAverager {
    private double weightSum = 0;
    private double productSum = 0;

    // computation-based accessor
    public double getAverage() {
        return productSum / weightSum;
    }

    // mutator: changes state of object
    public void add(int item, double weight) {
        weightSum += weight;
        productSum += item * weight;
    }

    public void add(int item) {
        add(item, 1.0);
    }
}
