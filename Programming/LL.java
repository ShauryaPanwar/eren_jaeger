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


    public void reverseiterate(){
        if(head == null || head.next == null){
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            //update
            prevNode = currNode;
            currNode = nextNode;

        }
        head.next=null;
        head = prevNode;
    }


    public Node reverseRecursive(Node head){

        if(head == null || head.next == null){
            return head;
        }
        Node newHead =reverseRecursive(head.next);
        head.next.next=head;
        head.next=null;

        return newHead;
    }



    public static void main(String [] args){
        LL list = new LL();

        list.addFirst("1");
        list.addLast("2");
        list.addLast("3");
        list.addLast("4");
        list.printList();
        // list.reverseiterate();
        list.head = list.reverseRecursive(list.head);
        list.printList();

        System.out.println("Size of the list is: " + list.Getsize());

    }
}


