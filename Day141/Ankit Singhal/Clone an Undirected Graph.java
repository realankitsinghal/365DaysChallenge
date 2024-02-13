class Solution{
    Node cloneGraph(Node node){
        HashMap<Integer, Node> hm = new HashMap();
        HashSet<Integer> visited = new HashSet();
        Queue<Node> q = new LinkedList();
        q.add(node);
        hm.put(node.val, new Node(node.val, new ArrayList()));
        
        while(!q.isEmpty()){
            Node cur = q.remove();
            visited.add(cur.val);
            ArrayList<Node> neighbours = hm.get(cur.val).neighbors ;
            for(Node n : cur.neighbors){
                if( !visited.contains(n.val)){
                    q.add(n);
                    hm.put(n.val,  new Node(n.val, new ArrayList()));   
                }
                neighbours.add(hm.get(n.val));
            }
        }
        return hm.get(node.val);
    }
}