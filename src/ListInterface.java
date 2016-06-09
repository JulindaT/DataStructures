/**
 * Created by Sean on 6/8/2016.
 */
public interface ListInterface<T>{
    void add(T newEntry);
    void add(int position, T newEntry);
    T getEntry(int location);
    void remove(int position);
    void replace(int position, T newEntry);
    boolean contains(T entry);
    int getLength();
    boolean isEmpty();
    T[] toArray();
}
