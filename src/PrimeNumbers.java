import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Blake on 5/4/2017.
 */
public class PrimeNumbers {
    private int T;
    private int N;
    private ArrayList<Integer> answers;

    public PrimeNumbers() {
        Scanner scanner = new Scanner(System.in);
        answers = new ArrayList<>();
        T = scanner.nextInt();
        int count;
        for (int t = 0; t < T; t++) {
            count = 0;
            N = scanner.nextInt();
            for (int i = 2; i <= N; i++) {
                if (isPrime(i)) {
                    count++;
                }
            }
            answers.add(count);
        }
        for (int i = 0; i < answers.size(); i++) {
            System.out.println("case #" + (i + 1) + ": " + answers.get(i));
        }
    }



    public static boolean isPrime(int n) {
        boolean isPrime = true;
        if (n == 1) return false;

        int factors = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors++;
            }
        }
        if (factors > 2) isPrime = false;
        return isPrime;
    }
}
