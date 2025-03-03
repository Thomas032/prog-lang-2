public class App {
    public static void main(String[] args) {
        Coin coin = new Coin();
        coin.setKey(1234);

        // Flip coin before locking
        System.out.println("Initial coin state: " + coin);
        coin.flip();
        System.out.println("After flip coin state: " + coin);

        // Lock the coin and try flipping
        coin.lock(1234);
        System.out.println("Coin locked? " + coin.locked());
        coin.flip(); // Should not change state because coin is locked
        System.out.println("Attempt to flip while locked: " + coin);

        // Unlock coin and flip again
        coin.unlock(1234);
        System.out.println("Coin locked? " + coin.locked());
        coin.flip();
        System.out.println("After unlock and flip: " + coin);
    }
}
