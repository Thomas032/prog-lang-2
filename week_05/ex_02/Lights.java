public class Lights {
    public static void main(String[] args) {
        final int N = 4;
        Bulb[] bulbs = new Bulb[N];

        // init the bulbs with ids
        for (int i = 0; i < N; i++) {
            bulbs[i] = new Bulb(i);
        }

        // turn some of the bulbs on
        bulbs[0].turnOn();
        bulbs[2].turnOn();

        // print the status of the bulbs
        for (int i = 0; i < N; i++) {
            System.out.println(bulbs[i]);
        }
    }
}
