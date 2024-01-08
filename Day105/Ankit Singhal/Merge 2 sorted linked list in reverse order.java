
class GfG
{
    Node mergeResult(Node node1, Node node2)
    {
	// Your code here	
	    ArrayList<Integer> a = new ArrayList<>();
	    Node temp = node1;
	    while(temp != null){
	        a.add(temp.data);
	        temp = temp.next;
	    }
	    temp = node2;
	    while(temp != null){
	        a.add(temp.data);
	        temp = temp.next;
	    }
	    Collections.sort(a, Collections.reverseOrder());
	    Node n = new Node(0);
	    Node ans = n;
	    for(int i=0;i<a.size();i++){
	        ans.next = new Node(a.get(i));
	        ans = ans.next;
	    }
	    return n.next;
    }
}