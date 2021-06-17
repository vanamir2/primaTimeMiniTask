import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        List<Node> list = new ArrayList<>();
        list.add(Node.create(1, new Node[]{Node.create(10, new Node[]{Node.create(100)})}));
        System.out.println(NodeUtils.getMeanValue(list));
        System.out.println(NodeUtils.getReducedMeanValue(list, 0.1));
    }
}