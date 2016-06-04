/**
 * Created by Sean on 6/1/2016.
 */
public class Node<T> {
    private T data;
    private Node linkedNode;

    public Node(T dataPortion) {
        this(dataPortion, null);
    }

    public Node(T dataPortion, Node nextNode) {
        data = dataPortion;
        linkedNode = nextNode;
    }

    public void setLinkedNode(Node nodeToLink) {
        this.linkedNode = nodeToLink;
    }

    public void setNodeData(T nodeData) {
        data = nodeData;
    }

    public Node getLinkedNode() {
        return linkedNode;
    }

    public T getData() {
        return data;
    }
}