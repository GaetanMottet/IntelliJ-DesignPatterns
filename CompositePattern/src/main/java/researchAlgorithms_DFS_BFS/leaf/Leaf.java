package researchAlgorithms_DFS_BFS.leaf;

import researchAlgorithms_DFS_BFS.component.Component;

import java.util.ArrayList;

public class Leaf extends Component {

    private final String name;

    public Leaf(String n){
        name = n;
    }

    public String toString() {
        return "Leaf " +name;
    }

    public ArrayList<Component> getChildren() {
        return new ArrayList<Component>();
    }

    @Override
    public String getName() {
        return null;
    }
}
