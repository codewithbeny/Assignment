package Questions;

import node.Node;

public class SinglyListWithPrime {
    private Node head;
    private Node tail;




    public SinglyListWithPrime() {
        head = null;
        tail = null;
    }
    public void addFirst(int data){

       if(Check_prime(data) == 0){
           Node node =new Node(data);
           if(isEmpty()){
               head =node;

           }else{
               head.setNext(node);
               head=node;
           }
           System.out.println("Adding Successfully");
       }else{
           System.out.println("The Element is not Prime");
       }
    }
    public boolean isEmpty(){
        return head == null;
    }
    public static int Check_prime(int data){
        int count = 0;
        for(int i=2; i<data; i++)
        {
            if(data%i == 0)
            {
                count++;
                break;
            }
        }
       return count;
    }

    public static void main(String[] args) {
        SinglyListWithPrime singlyListWithPrime = new SinglyListWithPrime();
        singlyListWithPrime.addFirst(5);
    }
}
