import java.lang.*;
import java.util.ArrayList;

public class StackArray<T> implements Coll<T>{
    
    private ArrayList<T> data;
    
    public StackArray() {
	data = new ArrayList<T>();
    }
    
    public void add(T d) {
	data.add(d);
    }
    
    public T remove() {
	return(data.remove(data.size() - 1));
    }
    
    public boolean isEmpty() {
	return(data.size() == 0);
    }

    public static void main(String[] args) {
        StackArray<Integer> ll = new StackArray<Integer>();
	
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
