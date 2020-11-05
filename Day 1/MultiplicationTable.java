import java.util.Scanner;

public class MultiplicationTable {

    void gooGooScan() {

        System.out.println("첫 단을 입력하세요.");
        int startNumber = gooGooScanner.nextInt();

        System.out.println("끝 단을 입력하세요");
        int endNumber = gooGooScanner.nextInt();

    }

    public static void main(String[] args) {

        GooGooDan gooGooDan = new GooGooDan();
        Scanner gooGooScanner = new Scanner(System.in);

        int startNumber;


        if (startNumber > 9 && endNumber > 9) {
            System.out.println("9 이하의 수로 다시 입력해 주세요.");
            gooGooDan.gooGooScan();
        }

        for (int i = startNumber; i < endNumber + 1; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j) );
            }
            System.out.println();
        }

        gooGooScanner.close();
    }
}
