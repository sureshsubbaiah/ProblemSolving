package Easy;


public class Fibonacci {

    /**
     * Linear approach of calculating Fibonacci for nth value.
     * Fibonacci values: n1=0,n2=1,n3=n1+n2->n(3-2)+n(3-1) and so on.
     *
     * @param n input nth value.
     */
    public static void fibDP(int n) {
        int fib[] = new int[n + 2];
        fib[0] = 0;
        fib[1] = 1;

        System.out.print(fib[0]+ " ");
        System.out.print(fib[1]+ " ");
        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 2] + fib[i - 1];
            System.out.print(fib[i]+ " ");
        }
    }

    public static void fibDP1(int n) {
        int current = 0;
        int next = 1;
        for (int i = 0; i <= n; i++) {
            System.out.print(current+ " ");
            int fib = current + next;
            current = next;
            next = fib;
        }
    }

    /**
     * Recursive solution.
     * Time Complexity Exponential
     *
     * @param n
     * @return
     */
    public static int fibRecursive(int n) {

        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }

        int res = fibRecursive(n - 2) + fibRecursive(n - 1);
        return res;
    }

    static int f[];

    /**
     * O(Log n) Time solution
     * @param n
     * @return
     */
    public static int fib(int n)
    {
        // Base cases
        if (n == 0)
            return 0;

        if (n == 1 || n == 2)
            return (f[n] = 1);

        // If fib(n) is already computed
        if (f[n] != 0)
            return f[n];

        int k = (n & 1) == 1? (n + 1) / 2
                : n / 2;

        // Applying above formula [Note value
        // n&1 is 1 if n is odd, else 0.
        f[n] = (n & 1) == 1? (fib(k) * fib(k) +
                fib(k - 1) * fib(k - 1))
                : (2 * fib(k - 1) + fib(k))
                * fib(k);

        return f[n];
    }

    /**
     * Time Complexity O(1)
     * http://www.maths.surrey.ac.uk/hosted-sites/R.Knott/Fibonacci/fibFormula.html
     * Fn = {[(√5 + 1)/2] ^ n} / √5
     *
     * @param n
     * @return
     */
    static int fibFormula(int n) {
        double phi = (1 + Math.sqrt(5)) / 2;
        return (int) Math.round(Math.pow(phi, n)
                / Math.sqrt(5));
    }

    public static void main(String[] args) {
        int n = 10;

//        fibDP(n);
        fibDP1(n);
//
//        for (int i = 0; i <= n; i++) {
//            System.out.print(fibRecursive(i)+ " ");
//        }

//        f= new int[n];
//        System.out.println(fib(n));

        System.out.println(fibFormula(10));

    }

}