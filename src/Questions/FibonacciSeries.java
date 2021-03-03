package Questions;

public class FibonacciSeries {
    static int a = 0;
    static int b = 1;
   static int sum=0;
    public static void main(String[] args) {
       FibonacciSeries fibonacciSeries =new FibonacciSeries();
      // fibonacciSeries.withoutRecursion(10);
        System.out.println(a);
        System.out.println(b);
        fibonacciSeries.with_recursion(10);
    }


    public void withoutRecursion(int no){
        int a = 0;
        int b = 1;
        int sum=0;
        for (int i = 1; i < no; i++) {
            System.out.println(a);
            sum = a + b;
            a = b;
            b = sum;
        }
    }
    public void with_recursion(int no){
        if(no > 0){
            sum = a + b;
            a = b;
            b = sum;
            System.out.println(sum);
            with_recursion(no-1);
        }
    }
}
