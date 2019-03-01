import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author berat
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        MaxMin solver = new MaxMin();
        solver.solve(1, in, out);
        out.close();
    }

    static class MaxMin {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = in.nextInt();

            Arrays.sort(arr);
            int min = Integer.MAX_VALUE;
            for (int i = 0; i <= n - k; i++)
                min = Math.min(min, arr[i + k - 1] - arr[i]);

            out.println(min);
        }

    }
}

