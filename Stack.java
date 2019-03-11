import java.lang.Exception;

public class Stack implements Coll{
    
    private class Node {
	private Node next;
	private int data;
	
	public Node(int data) {
	    this.data = data;
	    this.next = null;
	}
	
	public Node() {
	    this(-1);
	}
	
	public int getData() {
	    return(this.data);
	}
	
	public void setData(int data) {
	    this.data = data;
	}
	
	public void setNext(Node node) {
	    this.next = node;
	}
	
	public Node getNext() {
	    return(this.next);
	}
    }
    
    private Node start;
    
    public Stack() {
	start = new Node();
    }
    
    public void add(int data) {
	Node n = new Node(data);
	n.setNext(start.getNext());
	start.setNext(n);
    }
    
    public int remove() throws Exception {
	if (start.getNext() == null) {
	    throw new Exception("Cannot remove from empty list");
	}
	int tmp = this.start.getNext().getData();
	start.setNext(start.getNext().getNext());
	return(tmp);
    }
    
    public boolean isEmpty() {
	return(start.getNext() == null);
    }

    public static void main(String[] args) {
        Stack ll = new Stack();
	//	ArrayList<Integer> ll = new ArrayList<Integer>();
	
	for (int i = 0; i < 10; i++) {
	    ll.add(i * 2);
	}

	try {
	    while (!ll.isEmpty()) {
		System.out.println(ll.remove());
	    }
	} catch (Exception e) {
	    System.out.println("Attempted to remove from empty stack");
	    System.exit(-1);
	}
	
    }
    
}
