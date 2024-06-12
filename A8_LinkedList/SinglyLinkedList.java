package A8_LinkedList;

public class SinglyLinkedList {
    Node head;
    private int size;

    SinglyLinkedList(){
        this.size = 0;
    }

    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    //Insert at first position
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    //Insert at the end position
    public void addEnd(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    //Delete first node
    public void deleteFirst(){
        if(head == null){
            System.out.println("List is empty!");
            return;
        }
        size--;
        head = head.next;
    }

    //Delete last node
    public void deleteEnd(){
        if(head == null){
            System.out.println("List is empty!");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }
        Node secondLast = head;
        Node last = head.next;

        while (last.next != null) {
            last = last.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    //Printing List
    public void printList(){
        if(head == null){
            System.out.println("List is Empty!");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addFirst("1");
        list.addFirst("2");
        list.addEnd("3");
        list.addEnd("4");
        list.printList();
        list.deleteFirst();
        list.printList();
        list.deleteEnd();
        list.addEnd("10");
        list.printList();
        System.out.println(list.size);
    }
}
