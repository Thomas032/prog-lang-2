public class App {
    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();

        // initial count print
        System.out.println("Counter 1: " + counter1.getCount());
        System.out.println("Counter 2: " + counter2.getCount());

        // click few times
        counter1.click();
        counter1.click();
        counter2.click();

        // count print
        System.out.println("Counter 1 after clicks: " + counter1.getCount());
        System.out.println("Counter 2 after clicks: " + counter2.getCount());

        // reset
        counter1.reset();
        counter2.reset();

        // final print
        System.out.println("Counter 1 after reset: " + counter1.getCount());
        System.out.println("Counter 2 after reset: " + counter2.getCount());
    }
}
