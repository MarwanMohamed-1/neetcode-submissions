public class LinkedList {

    private Node head;

    private class Node {
        int data;
        Node next;

        Node(int val) {
            this.data = val;
            this.next = null;
        }
    }

    // Initialize an empty linked list
    public LinkedList() {
        head = null;
    }

    // Return the value at index i, or -1 if out of bounds
    public int get(int i) {
        Node current = head;

        for (int index = 0; current != null; index++) {
            if (index == i) {
                return current.data;
            }

            current = current.next;
        }

        return -1;
    }

    // Insert a node at the beginning
    public void insertHead(int val) {
        Node newNode = new Node(val);

        newNode.next = head;
        head = newNode;
    }

    // Insert a node at the end
    public void insertTail(int val) {
        Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    // Remove the node at index i
    public boolean remove(int i) {
        if (head == null) {
            return false;
        }

        // Remove the head
        if (i == 0) {
            head = head.next;
            return true;
        }

        Node current = head;

        // Find the node before the target
        for (int index = 0; index < i - 1; index++) {
            if (current.next == null) {
                return false;
            }

            current = current.next;
        }

        // Check if target exists
        if (current.next == null) {
            return false;
        }

        // Skip the target node
        current.next = current.next.next;

        return true;
    }

    // Return all values as an array
    public ArrayList<Integer> getValues() {
    ArrayList<Integer> values = new ArrayList<>();

    Node current = head;

    while (current != null) {
        values.add(current.data);
        current = current.next;
    }

    return values;
}
}
