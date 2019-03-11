import java.lang.Exception;

public interface Coll<T> {
    
    public abstract void add(T data);
    
    public abstract T remove() throws Exception; 
    
    public abstract boolean isEmpty();

}
