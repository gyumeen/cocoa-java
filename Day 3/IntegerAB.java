import java.util.Scanner;

@FunctionalInterface
interface Add {
    void addNumber(int a, int b);
}

public class IntegerAB {

    static void makeScanner(Scanner scanner) {

        while (true) {

            System.out.println("각각 1 이상 9 이하의 수로 입력한 두 수를 더합니다.");

            int a = scanner.nextInt();
            int b = scanner.nextInt();

            if (a > 0 && b < 10) {
                Add add = (a1, b1) -> System.out.println(a1 + b1);
                add.addNumber(a,b);

                scanner.close();
                break;
            }
        }
    }

    public static void main(String[] args) {

        IntegerAB.makeScanner(new Scanner(System.in));

    }
}
