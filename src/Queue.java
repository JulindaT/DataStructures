/**
 * Created by Sean on 6/1/2016.
 */
public class Queue<T> implements QueueInterface<T> {
    private Node firstNode;
    private Node lastNode;
    private T nodeDataTemp = null;
    private int numberOfEntries;
//this is the queue
    public Queue() {
        firstNode = null;
        lastNode = null;
        numberOfEntries = 0;
    }

    /**
     * Adds a new entry to the back of the queue.
     *
     * @param newEntry an object to be added
     */
    public void enqueue(T newEntry) {
        Node newNode = new Node(newEntry);
        if (isEmpty()) {
            firstNode = newNode;
        } else if (lastNode == null && firstNode != null) {
            firstNode.setLinkedNode(newNode);
            lastNode = newNode;
        } else {
            lastNode.setLinkedNode(newNode);
            lastNode = newNode;
        }
        ++numberOfEntries;

    }

    /**
     * Removes and returns the entry at the front of this queue.
     *
     * @return either the object at the front of the queue or, if the
     * queue is empty before the operation, null
     */
    public T dequeue() {
        nodeDataTemp = null;
        if (!isEmpty()) {
            nodeDataTemp = (T) firstNode.getData();
            firstNode = firstNode.getLinkedNode();
            numberOfEntries--;
            return nodeDataTemp;
        } else {
            return nodeDataTemp;
        }
    }

    /**
     * Retrieves the entry at the front of this queue.
     *
     * @return either the object at the front of the queue or, if the
     * queue is empty, null
     */
    public T getFront() {
        if (!isEmpty())
            return (T) firstNode.getData();
        else
            return null;
    }

    /**
     * Detects whether this queue is empty.
     *
     * @return true if the queue is empty, or false otherwise
     */
    public boolean isEmpty() {
        return lastNode == null && firstNode == null;
    }

    /**
     * Removes all entries from this queue.
     */
    public void clear() {
        firstNode = null;
        lastNode = null;

    }

    public int countOfEntries() {
        return numberOfEntries;
    }
}
