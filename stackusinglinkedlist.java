class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class stackusinglinkedlist{
    Node top = null;
    void push(int value){
        Node newNode = new Node(value);
        newNode.next=top;
        top = newNode;
        System.out.println(value + " pushed into stack");
    }
    void pop(){
        if(top==null){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println(top.data+" popped from stack");
            top=top.next;
        }
    }
    void peek(){
        if(top==null){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Top element: "+ top.data);
        }
    }
    void isEmpty(){
        if(top==null){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Stack is not empty ");
        }
    }
    public static void main(String[]args){
       stackusinglinkedlist stack = new stackusinglinkedlist();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.pop();
        stack.peek();
        stack.isEmpty();
    }
}
