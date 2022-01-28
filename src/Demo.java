import cs121.*;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        demoCounter();
        pause();

        demoAdder();
        pause();

        demoAverager();
        pause();

        demoWeightedAverager();
        pause();


        int n = 1000000000;
        long startTime = System.nanoTime();
        long sum = add1To(n);
        long stopTime = System.nanoTime();
        double elapsedSeconds =  (stopTime - startTime)*1e-9;
        System.out.printf("Adding 1 to %,d.\nSum=%,d\nElapsed time: %.2g seconds",
                n, sum, elapsedSeconds);
    }

    static void demoCounter() {
        Counter counter = new Counter();
        counter.add();
        counter.add();
        counter.add();
        System.out.printf("count: %d\n", counter.getCount());
    }

    static void demoAdder() {
        Adder adder = new Adder();
        adder.add(1);
        adder.add(2);
        adder.add(7);
        System.out.printf("sum: %d\n", adder.getSum());
    }

    static void demoAverager() {
        Averager averager = new Averager();
        averager.add(1);
        averager.add(2);
        averager.add(4);
        System.out.printf("average: %f\n", averager.getAverage());
    }

    static void demoWeightedAverager() {
        WeightedAverager averager = new WeightedAverager();
        averager.add(1, 2.0);
        averager.add(2, 3.0);
        averager.add(4, 2.5);
        System.out.printf("weighted average: %f\n", averager.getAverage());
    }

    static long add1To(int n) {
        long sum = 0;
        for (int i=1; i<n; i++) {
            sum += i;
        }
        sum += n;
        return sum;
    }

    static void pause() {
        Scanner scanner = new Scanner(System.in);
        scanner.hasNextLine();
    }
}
