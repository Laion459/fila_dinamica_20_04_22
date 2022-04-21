import java.util.Objects;

public class Node {
    private Object element;
    private Node next;

    public Node(){}

    public Node(Object element, Node next) {
        this.element = element;
        this.next = next;
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Node)) return false;
        Node node = (Node) o;
        return getNext() == node.getNext() && Objects.equals(getElement(), node.getElement());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getElement(), getNext());
    }

    @Override
    public String toString() {
        return "Node{" +
                "element=" + element +
                ", next=" + next +
                '}';
    }
}
