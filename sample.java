public class sample{
    public static void main(String[] args) {
        int n = 10; // Number of terms to print
        int first = 0, second = 1;
        
        System.out.println("Fibonacci Series up to " + n + " terms:");

        // Print the first two terms of the Fibonacci series
        System.out.print(first + " " + second + " ");
        
        // Print the rest of the Fibonacci series
        for (int i = 3; i <= n; i++) {
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
    }
}

