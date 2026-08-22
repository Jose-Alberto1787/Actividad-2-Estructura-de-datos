public class Stack{
    Node top;
    Stack(){
        top=null;
    }
    public void push(String data){
        Node newNode= new Node(data);
        newNode.next = top;
        top = newNode;
        System.out.println("Accion registrada");
    }
    public String pop(){
        if (top == null){
            return "La pila esta vacia";
        }
        String value = top.data;
        top = top.next;
        return value + "desecha adecuadamente";
    }
    public String peek(){
        if(top==null){
            throw new RuntimeException("La pila esta vacia");
        }
        return top.data;
    }
    public boolean isEmpty(){
        return top==null;
    }
    public String size(){
        Node current = top;
        int count =0;
        while(current!= null){
            System.out.println(current.data);
            current = current.next;
            count +=1;
        }
        return "Hay " + count + " elemntos en el historial";
    }
}