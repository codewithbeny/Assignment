package Questions;
// Stack Push Method Using array
public class StackUsingArray {
   private  int top;
   private int max_capacity;
    int [] arr ;
    int size;

    public StackUsingArray(int max_capacity) {
        top = -1;
        arr=new int[max_capacity];
        size =0;
        this.max_capacity = max_capacity;
    }

    public void push(int element){
        if(top!=max_capacity-1){
            top++;
            arr[top]=element;
            System.out.println("Added Successfully");
        }else{
            System.out.println("Stack Overflow");
        }
    }

    public static void main(String[] args) {
        StackUsingArray stackUsingArray=new StackUsingArray(3);
        stackUsingArray.push(10);
        stackUsingArray.push(10);
        stackUsingArray.push(10);
        stackUsingArray.push(10);
    }
}
