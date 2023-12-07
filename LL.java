public class LL{
    private Node head;
    private Node tail;
    private int size;
    // constructor for ll class
    public LL(){
        this.size = 0;
    }
    
    // Insert first function
    public void InsertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail==null){
            tail=head;
        }
        size++;

    }
    // insert at index given by user
    public void indexinsert(int val,int index){
        if(index == 0){
            InsertFirst(val);
        }
        if(index==size){
            insertlast(val);
        }
        Node temp=head;
        for (int i = 1; i<index; i++) {
            temp=temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next = node;
        size++;

    }
// deleting first value
public int deletefirst(){
    int val = head.value;
    head= head.next;
    if(head==null){
        tail=null;
    }
    size--;
    return val;
}

public int deletelast(){
    if(size<=1){
        deletefirst();
    }
    Node secondlast = get(size-2);
    int val = tail.value;
    tail = secondlast;
    tail.next = null;
    return val;
}
// here we delete middle elements
public int deletemiddle(int index){
    Node prev = get(index-1);
    int val = prev.next.value;
    prev.next = prev.next.next;
    return val;
}

// here we are getting next node of every node ,using get method as node.next is private
public Node get(int index){
    Node node = head;
    for(int i =1;i<index;i++){
         node = node.next;
    }
    return node; 
}

    // display the list
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value+" -> ");
            temp= temp.next;
        }
    }
    // insert at last
    public void insertlast(int val){
        Node node = new Node(val);
        if(tail==null){
            InsertFirst(val);
        }
        tail.next = node;
        tail = node;
        size++;
        
    }

    // Node class
    public class Node{
        private int value;
        private Node next;

        // constructor with one parameter
        public Node(int value){
            this.value = value;
        }
        // constructor with 2 parameters
        public Node (int value,Node next){
            this.value = value;
            this.next = next;
        }
    }

}
