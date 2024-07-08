package A8_LinkedList;

class Demo {

    Node head;

    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addlast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }

    public void deleteFirst(){
        if(head == null){
            System.out.println("Empty List!");
            return;
        }
        head = head.next;
    }

    public void deleteLast(){
        if(head == null){
            System.out.println("Empty List!");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        Node lastNode = head.next;
        Node secondLastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLastNode = secondLastNode.next;
        }
        secondLastNode.next = null;
    }

    public void printList(){
        if(head == null){
            System.out.println("Empty List!");
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
        Demo dm = new Demo();
        dm.addFirst("First Element");
        dm.printList();
        dm.addFirst("Second Element");
        dm.printList();
        dm.addlast("Third Element");
        dm.printList();
        dm.deleteLast();
        dm.printList();
    }
}