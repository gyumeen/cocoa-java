import java.util.Scanner;

public class TestScore {
    public static void main(String[] args) {

        Scanner scoreScanner = new Scanner(System.in);
        int score = scoreScanner.nextInt();

        if (score >= 0 && score <= 100) {
            if (score >= 90) System.out.println("A");
            if (score >= 80 && score <= 89) System.out.println("B");
            if (score >= 70 && score <= 79) System.out.println("C");
            if (score >= 60 && score <= 69) System.out.println("D");
            if (score < 60) System.out.println("F");

        }
    }
}
