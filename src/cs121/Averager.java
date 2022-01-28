package cs121;

public class Averager {
    private Counter counter = new Counter();
    private Adder adder = new Adder();

    // computation-based accessor
    public double getAverage() {
        return adder.getSum() / (double)counter.getCount();
    }

    // mutator: changes state of object
    public void add(int item) {
        adder.add(item);
        counter.add();
    }
}
