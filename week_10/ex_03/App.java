public class App {
    public static void main(String[] args) {
        MonetaryCoin penny = new MonetaryCoin(1);
        MonetaryCoin nickel = new MonetaryCoin(5);
        MonetaryCoin dime = new MonetaryCoin(10);
        MonetaryCoin quarter = new MonetaryCoin(25);
        MonetaryCoin dollar = new MonetaryCoin(100);
        
        MonetaryCoin[] coins = {penny, nickel, dime, quarter, dollar};
        
        System.out.println("Initial state of coins:");
        for (MonetaryCoin coin : coins) {
            System.out.println(coin);
        }
        
        System.out.println("\nFlipping all coins...");
        for (MonetaryCoin coin : coins) {
            coin.flip();
            System.out.println(coin + " - " + (coin.isHeads() ? "Heads" : "Tails"));
        }
        
        int sum = 0;
        for (MonetaryCoin coin : coins) {
            sum += coin.getValue();
        }
        
        System.out.println("\nTotal value of all coins: " + sum + " cents ($" + (sum / 100.0) + ")");
    }
}