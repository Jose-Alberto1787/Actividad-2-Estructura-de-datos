public class Queue{
    Node front;
    Node rear;
    Queue(){
        front=null;
        rear=null;
    }
    public void enqueue(String data){
        Node newNode = new Node(data);
        if(front==null){
            front=newNode;
            rear=newNode;
            return;
        }
        rear.next = newNode;
        rear=newNode;
    }
    public String dequeue(){
        if(front==null){
            rear=null;
            return "1";
        }
        String value = front.data;
        front = front.next;
        return value;
    }
    public String peek(){
        if (front==null){
            throw new RuntimeException("Cola esta vacia");
        }
        return front.data;
    }
    public boolean isEmpty(){
        return front==null;
    }
    public String size(){
        Node current=front;
        int cuenta= 0;
        while(current!=null){
            System.out.println(current.data);
            current = current.next;
            cuenta+=1;
        }
        return "Hay " + cuenta + " tareas pendientes";
    }
}