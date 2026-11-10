package Week1.Day8;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }

}

public class linkedlist {
    public static void main(String args[]){
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        head.next = second;
        second.next = third;

        System.out.println("Original linked list");
        printList(head);

        Node newNode = new Node(5);
        newNode.next = head;
        head = newNode;

        System.out.println("After Insertion:");
        printList(head);
    }
     static void printList(Node head) {

        Node current = head;

        while (current != null) {
            System.out.print(current.data + " → ");
            current = current.next;
        }

        System.out.println("null");
    }

        
    
}
