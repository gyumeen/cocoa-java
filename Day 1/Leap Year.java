import java.util.Scanner;

public class YunYear {

    private final Scanner yoonScanner = new Scanner(System.in);
    private int year = (int) yoonScanner.nextDouble();

    private void makeYear() {
        if (year >= 1 && year <= 4000) { return; }
    }

    public static void main(String[] args) {
        YunYear yunYear = new YunYear();

        makeYear();

        if ((year % 4) == 0
                && (year % 100) != 0
                && (year % 400) == 0) {

            System.out.print(1);

        } else {

            System.out.print(0);

        }
    }
}
