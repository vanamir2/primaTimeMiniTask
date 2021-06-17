import java.util.Arrays;
import java.util.List;

public interface Node {

    public static Node create(double value) {
        return Node.create(value, new Node[]{});
    }

    public static Node create(double value, Node[] nodes) {
        return new Node() {
            public double getValue() {
                return value;
            }

            public List<Node> getNodes() {
                return Arrays.asList(nodes);
            }
        };
    }

    public double getValue();

    public List<Node> getNodes();

}