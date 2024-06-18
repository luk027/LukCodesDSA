package A8_LinkedList;

public class ReverseList {

    //Space complexity = O(1)
    //Time Complexity = O(n)

    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    //Inserting at first position
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    //Insertion at last position
    public void addEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    //Delete at first position
    public void deleteFirst(){
        if(head == null){
            System.out.println("List is Empty!");
            return;
        }
        head = head.next;
    }

    //Deletion at last position
    public void deleteLast(){
        if(head == null){
            System.out.println("List is Empty!");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        Node secondLast = head;
        Node last = head.next;
        while (last.next != null) {
            secondLast = secondLast.next;
            last = last.next;
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
            System.out.print("[ "+currNode.data+" ]"+" -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    //Reverese a linked list (ITERATIVE WAY)
    public void revItrList(){
        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            //update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }
    //Reverese a linked list (RECURSIVE WAY)
    public Node revRecList(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node newNode = revRecList(head.next);
        head.next.next = head;
        head.next = null;

        return newNode;
    }


    public static void main(String[] args) {
        ReverseList rl = new ReverseList();
        rl.addEnd(1);
        rl.addEnd(2);
        rl.addEnd(3);
        rl.addEnd(4);
        rl.printList();
        rl.head = rl.revRecList(rl.head);
        rl.printList();
    }
}
