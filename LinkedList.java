public class LinkedList {
   private Node head;
   private int size;

    public LinkedList(){
        head = null;
        size = 0;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size()==0;
    }
    public void add(int data){
        Node newNode = new Node<>(data);
        if(head==null){
            head = newNode;
        }
        else{
            Node current = head;
            while(current.next!=null){
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }
    public void add(int data, int pos){
        if(pos<0 || pos>size){
            throw new IndexOutOfBoundsException("Invalid Position");
        }
        Node newNode = new Node<>(data);
        if(pos==0){
            newNode.next = head;
            head = newNode;
        }
        else{
            int i=0;
            Node current = head;
            while(i<pos-1){
                current = current.next;
                i++;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
        size++;
    }
    public void get(){
        Node current = head;
        while(current!=null){
            System.out.print(current.data+" ");
            current = current.next;
        }
    }
}
