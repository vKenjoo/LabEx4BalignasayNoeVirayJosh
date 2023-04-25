public class LinkedList<T> {
    private Node<T> head;
    private int size;

    public LinkedList() {
        head = null;
        size = 0;
    }

    public void add(T value) {
        Node<T> newNode = new Node<>(value);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> currentNode = head;
            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(newNode);
        }
        size++;
    }

    public boolean contains(T value) {
        Node<T> currentNode = head;
        while (currentNode != null) {
            if (currentNode.getValue().equals(value)) {
                return true;
            }
            currentNode = currentNode.getNext();
        }
        return false;
    }

    public void remove(T value) {
        if (head == null) {
            return;
        }

        if (head.getValue().equals(value)) {
            head = head.getNext();
            size--;
            return;
        }

        Node<T> prevNode = head;
        Node<T> currentNode = head.getNext();
        while (currentNode != null) {
            if (currentNode.getValue().equals(value)) {
                prevNode.setNext(currentNode.getNext());
                size--;
                return;
            }
            prevNode = currentNode;
            currentNode = currentNode.getNext();
        }
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<T> currentNode = head;
        while (currentNode != null) {
            sb.append(currentNode.getValue()).append(" ");
            currentNode = currentNode.getNext();
        }
        return sb.toString();
    }

    private static class Node<T> {
        private T value;
        private Node<T> next;

        public Node(T value) {
            this.value = value;
            next = null;
        }

        public T getValue() {
            return value;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }
    }

    public BTNode<T> poll() {
        return null;
    }
}