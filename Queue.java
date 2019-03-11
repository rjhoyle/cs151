import java.lang.Exception;

public class Queue implements Coll{
    
    private class Node {
	private Node next;
	private int data;
	
	public Node(int data) {
	    this.data = data;
	    this.next = null;
	}
	
	public Node() {
	    this('\0');
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
    private Node end;

    public Queue() {
	start = new Node();
	end = start;
    }
    
    public void add(int data) {
	Node n = new Node(data);
	n.setNext(end.getNext());
	end.setNext(n);
	//	printStack();
	end = n;
    }
    
    public int remove() throws Exception {
	if (start.getNext() == null) {
	    throw new Exception("Cannot remove from empty list");
	}
	int tmp = this.start.getNext().getData();
	start.setNext(start.getNext().getNext());

	if (start.getNext() == null) {
	    end = start;
	}
	return(tmp);
    }
    
    public boolean isEmpty() {
	return(start.getNext() == null);
    }

    public void printStack() {
	try {
	    Node s = start.getNext();
	    while (s != null) {
		System.out.print(s.getData() + " ");
		s = s.getNext();
	    }
	    System.out.println("");
	} catch (Exception e) {
	    System.out.println("Attempted to remove from empty stack");
	    System.exit(-1);
	}

    }

    public static void main(String[] args) {
        Queue ll = new Queue();
	//	ArrayList<Integer> ll = new ArrayList<Integer>();
	
	for (int i = 0; i < 10; i++) {
	    ll.add(i * 2);
	}

	try {
	    while (!ll.isEmpty()) {
		System.out.println(ll.remove());
	    }
	    for (int i = 0; i < 10; i++) {
		ll.add(i * 2);
	    }
	    while (!ll.isEmpty()) {
		System.out.println(ll.remove());
	    }	    
	} catch (Exception e) {
	    System.out.println("Attempted to remove from empty stack");
	    System.exit(-1);
	}
	
    }
    
}
