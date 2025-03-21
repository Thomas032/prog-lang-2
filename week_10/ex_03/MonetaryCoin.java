public class MonetaryCoin extends Coin {
    private int value;
    
    public MonetaryCoin(int value) {
        super();
        this.value = value;
    }
    
    public int getValue() {
        return value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    @Override
    public String toString() {
        return super.toString() + " (Value: " + value + ")";
    }
}