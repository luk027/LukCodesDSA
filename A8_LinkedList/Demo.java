package A8_LinkedList;

public class Demo {

    Node head;

    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
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

    //Insert at end position
    public void addEnd(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next!= null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    //delete at first position
    public void deleteFirst(){
        if(head == null){
            System.out.println("List is empty!");
            return;
        }
        head = head.next;
    }

    //delete at last position
    public void deleteEnd(){
        if(head == null){
            System.out.println("List is empty!");
            return;
        }
        Node secondLastNode = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            secondLastNode = secondLastNode.next;
            lastNode =lastNode.next;
        }
        secondLastNode.next = null;
    }

    //print list
    public void printList(){
        if(head == null){
            System.out.println("List is empty!");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }
    //reverse list
    public void reverseList(){
        if (head == null) {
            System.out.print("List is empty!");
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null) {
           Node nextNode =  currNode.next;
           currNode.next = prevNode;

           //updating
           prevNode = currNode;
           currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }
    
    public static void main(String[] args) {
        Demo de = new Demo();
        de.addFirst("1");
        de.addFirst("2");
        de.addEnd("3");
        de.addEnd("4");
        de.addEnd("5");
        de.addEnd("6");
        de.printList();
        de.deleteEnd();
        de.printList();
        de.reverseList();
        de.printList();

    }
}
