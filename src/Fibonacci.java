public class  Fibonacci {

    public static void main(String[] args) {

        FibonacciSemRecursão(5);
    }

    public static int FibonacciSemRecursão(int n){
        if (n <= 1){
            return n;
        }
        int a = 0;
        int b = 1;

        for (int i = 2; i <= n; i++){

            System.out.println("Iteração:");
            System.out.println();

            int c = a + b;
            a = b;
            b = c;

            System.out.println("A:" + a);
            System.out.println("B:" + b);
            System.out.println("C:" + c);
            System.out.println("I:" + i);
            System.out.println();

        }

        System.out.println("Resultado: " + b);
        return b;
    }
}
