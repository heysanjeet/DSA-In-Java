package data_structures.linked_list.doubly_linked_list;

public class Node {
    public int data;
    public Node next;
    public Node previous;

    public void displayNode() {
        System.out.println("{ " + data + " }");
    }
}
