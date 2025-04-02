
public class Leaf extends Component {

    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void print(int depth) {
        System.out.println(" ".repeat(depth) + "Worker: " + name);
    }
}
