public class Fibonacci {

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static boolean isInFibonacci(int n) {
        int i = 0;
        while (true) {
            int fib = fibonacci(i);
            if (fib == n) {
                return true;
            } else if (fib > n) {
                return false;
            }
            i++;
        }
    }

    public static void main(String[] args) {
        int num = 13; // número para verificar
        boolean isInFib = isInFibonacci(num);
        if (isInFib) {
            System.out.println(num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(num + " não pertence à sequência de Fibonacci.");
        }
    }
}