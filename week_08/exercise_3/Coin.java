public class Coin implements Lockable {
    private final int HEADS = 0;
    private final int TAILS = 1;

    private int face;
    private boolean locked = false;
    private int key;

    public Coin() {
        flip();
    }

    public void flip() {
        if (!locked) {
            face = (int) (Math.random() * 2);
        }
    }

    public boolean isHeads() {
        return (face == HEADS);
    }

    public String toString() {
        return (face == HEADS) ? "Heads" : "Tails";
    }

    @Override
    public void setKey(int key) {
        if (!locked) {
            this.key = key;
        }
    }

    @Override
    public void lock(int key) {
        if (this.key == key && !locked) {
            locked = true;
        }
    }

    @Override
    public void unlock(int key) {
        if (this.key == key && locked) {
            locked = false;
        }
    }

    @Override
    public boolean locked() {
        return locked;
    }
}
