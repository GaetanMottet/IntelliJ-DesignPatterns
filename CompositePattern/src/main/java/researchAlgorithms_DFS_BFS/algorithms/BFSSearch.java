package researchAlgorithms_DFS_BFS.algorithms;

import researchAlgorithms_DFS_BFS.component.Component;

import java.util.ArrayList;

public class BFSSearch extends TraversalAlgoritm {
    //Overrided method (q = q+s).
    protected void addSuccessors(ArrayList<Component> q, ArrayList<Component> s)
    {
        q.addAll(s);
    }

}
