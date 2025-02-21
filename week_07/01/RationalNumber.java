public class RationalNumber implements Comparable<RationalNumber> {
    private int numerator, denominator;

    public RationalNumber(int numer, int denom) {
        if (denom == 0)
            denom = 1;
        if (denom < 0) {
            numer = -numer;
            denom = -denom;
        }
        numerator = numer;
        denominator = denom;
        reduce();
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    private void reduce() {
        if (numerator != 0) {
            int common = gcd(Math.abs(numerator), denominator);
            numerator /= common;
            denominator /= common;
        }
    }

    private int gcd(int num1, int num2) {
        while (num1 != num2) {
            if (num1 > num2)
                num1 -= num2;
            else
                num2 -= num1;
        }
        return num1;
    }

    public double toDecimal() {
        return (double) numerator / denominator;
    }

    @Override
    public int compareTo(RationalNumber other) {
        double thisValue = this.toDecimal();
        double otherValue = other.toDecimal();
        final double TOLERANCE = 0.0001;

        if (Math.abs(thisValue - otherValue) < TOLERANCE)
            return 0;
        else if (thisValue < otherValue)
            return -1;
        else
            return 1;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
