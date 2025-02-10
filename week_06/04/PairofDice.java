public class PairOfDice {
    private Die die1;
    private Die die2;

    public PairOfDice() {
        die1 = new Die();
        die2 = new Die();
    }

    public void rollDice() {
        die1.roll();
        die2.roll();
    }

    public int getSum() {
        return die1.getValue() + die2.getValue();
    }

    @Override
    public String toString() {
        return "Die 1 [" + die1.getValue() + "] + Die 2 [" + die2.getValue() + "] = " + getSum();
    }
}
