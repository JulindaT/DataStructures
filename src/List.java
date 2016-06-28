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
        T result = null;
        if(getNodeAt(location)!=null){
            Node tempNode = getNodeAt(location);
            result = (T) tempNode.getData();
        }
        return result;
    }

    public void remove(int position) {
        Node currentNode = getNodeAt(position);
        if(currentNode!= null && currentNode!=firstNode && currentNode.getLinkedNode()!= null)
        {
            Node replacementNode = currentNode.getLinkedNode();
            getNodeAt(position-1).setLinkedNode(replacementNode);
        }
        else if(currentNode != null && currentNode !=firstNode && currentNode.getLinkedNode()==null)
        {
            getNodeAt(position-1).setLinkedNode(null);
        }
        else if (currentNode == lastNode){
            lastNode = null;
        }
        else if (currentNode == firstNode){
            firstNode = null;
        }

    }

    public void replace(int position, T newEntry) {
        getNodeAt(position).setNodeData(newEntry);
    }

    public boolean contains(T entry) {
        boolean result = false;
        Node currentNode = firstNode;
        if(currentNode != null){
            int position = 1;
            while (position <= countOfEntries()){
                if(currentNode.getData().equals(entry)){
                    result = true;
                }
                else if(currentNode.getLinkedNode() != null){
                    currentNode = currentNode.getLinkedNode();
                }
                position++;
            }
        }
        return result;
    }

    public T find(T entry){
        T result = null;
        int position = 1;
        while (position <= getLength()){
            if(entry.equals(getEntry(position))){
                result = getEntry(position);
            }
            else position++;
        }
        return result;

    }

    public int findPosition(T entry){
        int result = 0;
        int position = 1;
        while (position <= getLength()){
            if(entry.equals(getEntry(position))){
                result = position;
            }
//            boolean anotherentry = (Address)  entry.
            T tempEntry = getEntry(position);
            boolean temp = entry.equals(getEntry(position));
            position++;
        }
        return result;

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
