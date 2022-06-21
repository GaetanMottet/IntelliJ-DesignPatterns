package researchAlgorithms_DFS_BFS.composite;

import researchAlgorithms_DFS_BFS.component.Component;

import java.util.ArrayList;

public class Composite extends Component {

    private String name;
    private final ArrayList<Component> children;

    public Composite(String name) {
        this.name = name;
        children = new ArrayList<Component>();
    }

    public void setName(String n){
        name = n;
    }

    public void add(Component c){
        children.add(c);
    }

    public void remove(Component c){
        children.remove(c);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        String temp = "Composite " +name;
        for(Component n : this.children){
            temp = temp +n.toString();
        }

        return temp;
    }

}
