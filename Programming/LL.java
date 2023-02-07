package Programming;
class LL{
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }
    LL(){

        this.size =0;
    }
    Node head;
    private int size;

    public void addFirst(String data){
        Node newNode= new Node(data);
        if(head == null){
            head = newNode;
            return;
    }
    newNode.next = head;
    head = newNode;
}

    public void addLast(String data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode =head;

        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void printList()
    {
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node currNode =head;
        while(currNode != null){
            System.out.print(currNode.data + "-> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public void deleteFirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        size--;
        head = head.next;   
    }

    public void deleteLast(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }
        Node secondLast = head;
        Node Last = head.next;

        while(Last.next != null){
            secondLast = secondLast.next;
            Last = Last.next;
        }
        secondLast.next = null;
    }

    public int Getsize(){
        return size;
    }



    public static void main(String [] args){
        LL list = new LL();

        list.addFirst("hello");
        list.printList();   
        list.addLast("world");
        list.printList();
        list.addLast("This is ");
        list.addLast("a linked list");
        list.printList();
        list.deleteLast();
        list.printList();
        list.deleteFirst();
        list.printList();

        System.out.println("Size of the list is: " + list.Getsize());

    }
}


