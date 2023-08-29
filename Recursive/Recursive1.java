package recursive;


public class Recursive1 {
   
    public static void printNum(int n) { // Print num upto n
        if(n==0) {
            return;
        }
        printNum(n-1);
        System.out.print(n+" ");
    }

    public static void printSum(int i, int n, int sum) { //print sum upto n;
        if(i == n) {
            sum+=n;
            System.out.println(sum);
            return;
        }
        sum+=i;
        printSum(i+1, n, sum);
    }

    public static int getFactorial(int n) {  //calculate factorial
        if(n==1) {
            return 1;
        }
        return n*getFactorial(n-1);
    }
    
    public static void printFib(int a, int b, int n) { //print fibonacchi
        if(n==0) {
            return;
        }
        int c = a+b;
        System.out.print(c+" ");
        printFib(b, c, n-1);
    }

    public static int getXpowerN(int x, int n) { //Get xPowN
        if(n==1) {
            return x;
        }
        if(n==0) {
            return 1;
        }
        if(x==0) return 0;

        if(n%2==0) {
           return getXpowerN(x, n/2) * getXpowerN(x, n/2);
        } else {
            return  x*getXpowerN(x, n-1);
        }
    }

    public static void main(String[] args) {
        printNum(10);
        System.out.println();
        printSum(0, 10, 0);
        System.out.println(getFactorial(5));
        System.out.println();
        printFib(0, 1, 15);
        System.out.println();
        System.out.println(getXpowerN(5, 5));

    }
    
}
