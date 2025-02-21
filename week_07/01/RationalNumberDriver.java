public class RationalNumberDriver {
    public static void main(String[] args) {
        RationalNumber r1 = new RationalNumber(1, 4);
        RationalNumber r2 = new RationalNumber(2, 8);
        RationalNumber r3 = new RationalNumber(1, 5);
        RationalNumber r4 = new RationalNumber(2, 16);

        System.out.println("Comparing " + r1 + " and " + r2 + ": " + r1.compareTo(r2));
        System.out.println("Comparing " + r1 + " and " + r3 + ": " + r1.compareTo(r3));
        System.out.println("Comparing " + r3 + " and " + r4 + ": " + r3.compareTo(r4));
        System.out.println("Comparing " + r4 + " and " + r1 + ": " + r4.compareTo(r1));
    }
}
