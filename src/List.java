/**
 * Created by Sean on 6/9/2016.
 */
public class List<T> extends Queue<T> implements ListInterface<T>{

    private Node getNodeAt(int position) {
        int currentPosition;
        Node currentNode;
        if(!isEmpty()) {
            currentPosition = 1;
            currentNode = firstNode;
            while(currentPosition <= position){
                if(currentPosition == position){
                    return currentNode;
                }
                else{
                    currentNode=currentNode.getLinkedNode();
                    currentPosition++;
                }
            }
        }
        else {return null;}
    return currentNode;
    }

    public void add(T newEntry) {
        enqueue(newEntry);
    }

    public void add(int position, T newEntry) {

    }

    public T getEntry(int location) {
        if(getNodeAt(location)!=null){
            Node tempNode = getNodeAt(location);
            return (T) tempNode.getData();
        }
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

    public T[] toArray() {
        @SuppressWarnings("unchecked")
        T[] arr = (T[])new Object[getLength()];
        int index = 0;
        Node currentNode = firstNode;
        while ((currentNode != null) && (index < numberOfEntries))
        {
            arr[index] = (T) currentNode.getData();
            currentNode = currentNode.getLinkedNode();
            index++;
        } // end while

        return arr;
    }
}
