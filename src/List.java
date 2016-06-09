/**
 * Created by Sean on 6/9/2016.
 */
public class List<T> extends Queue<T> implements ListInterface<T>{

    private Node getNodeAt(int position) {
        return null;
    }

    public void add(T newEntry) {
        enqueue(newEntry);
    }

    public void add(int position, T newEntry) {

    }

    public T getEntry(int location) {
        return null;
    }

    public void remove(int position) {

    }

    public void replace(int position, T newEntry) {

    }

    public boolean contains(T entry) {
        return false;
    }

    public int getLength() {
        return countOfEntries();
    }

    public boolean isEmpty() {
        return false;
    }

    public T[] toArray() {
        @SuppressWarnings("unchecked")
        T[] arr = (T[])new Object[getLength()];
        int index = 0;
        Node currentNode = firstNode;
        while ((index < numberOfEntries) && (currentNode != null))
        {
            arr[index] = (T) currentNode.getData();
            currentNode = currentNode.getLinkedNode();
            index++;
        } // end while

        return arr;
    }
}
