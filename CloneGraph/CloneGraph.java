/**
 * Definition for undirected graph.
 * class UndirectedGraphNode {
 *     int label;
 *     List<UndirectedGraphNode> neighbors;
 *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
 * };
 */
public class Solution {
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if(node == null)
            return null;
        HashMap<UndirectedGraphNode,UndirectedGraphNode> visited = new HashMap<UndirectedGraphNode,UndirectedGraphNode>();
        Queue<UndirectedGraphNode> queue = new LinkedList<UndirectedGraphNode>();//set of all the nodes in the graph
        UndirectedGraphNode cur = new UndirectedGraphNode(node.label);
        visited.put(node,cur);
        queue.add(node);
        while(!queue.isEmpty()){
            UndirectedGraphNode n = queue.remove();
            cur = visited.get(n);
            List<UndirectedGraphNode> lst = n.neighbors;
            //System.out.print("cur n is" +n.label+" neighbors are" );
            for(UndirectedGraphNode tmp : lst){//for each neighbor, if it is not in the visited map, added it to the map and to teh queue
                //System.out.print(" "+ tmp.label );
                if(visited.containsKey(tmp))
                    cur.neighbors.add(visited.get(tmp));
                else{
                    UndirectedGraphNode copyNode = new UndirectedGraphNode(tmp.label);
                    visited.put(tmp, copyNode);
                    cur.neighbors.add(copyNode);
                    queue.add(tmp);
                   // System.out.print("else");
                }
            }
            //System.out.println();
        }
        return visited.get(node); 
    }

}