
import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

    private String groupName;
    private String bossName;
    private List<Component> components = new ArrayList<>();

    public Composite(String groupName, String bossName) {
        this.groupName = groupName;
        this.bossName = bossName;
    }

    public String getGroupName() {
        return groupName;
    }

    public String getBossName() {
        return bossName;
    }

    public void add(Component component) {
        components.add(component);
    }

    public void remove(Component component) {
        components.remove(component);
    }

    public List<Component> getChildren() {
        return components;
    }

    @Override
    public void print(int depth) {
        System.out.println();
        System.out.println(" ".repeat(depth) + "Group: " + groupName + ", boss's name: " + bossName);
        for (Component component : components) {
            component.print(depth + 1);
        }
    }
}
