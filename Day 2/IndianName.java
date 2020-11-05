import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IndianName {

    public static void main(String[] args) {

        Scanner birthScanner = new Scanner(System.in);
        String year = null;
        String month = null;
        String day = null;

        System.out.println("생년월일을 입력해 주세요>");

        year = birthScanner.next();
        month = birthScanner.next();
        day = birthScanner.next();

        String modifiedYear = year.substring(year.length()-1, year.length());
        System.out.println(year.substring(2));


        Map yearMap = new HashMap();

        yearMap.put("0", "시끄러운");
        yearMap.put("1", "푸른");
        yearMap.put("2", "어두운");
        yearMap.put("3", "조용한");
        yearMap.put("4", "웅크린");
        yearMap.put("5", "백색");
        yearMap.put("6", "지혜로운");
        yearMap.put("7", "용감한");
        yearMap.put("8", "날카로운");
        yearMap.put("9", "욕심많은");

        Map monthMap = new HashMap();
        monthMap.put("1", "늑대");
        monthMap.put("2", "태양");
        monthMap.put("3", "양");
        monthMap.put("4", "매");
        monthMap.put("5", "황소");
        monthMap.put("6", "불꽃");
        monthMap.put("7", "나무");
        monthMap.put("8", "달빛");
        monthMap.put("9", "말");
        monthMap.put("10", "돼지");
        monthMap.put("11", "하늘");
        monthMap.put("12", "바람");


        System.out.println(yearMap.get(modifiedYear) + " ");

        //System.out.println("당신의 이름은 " + year + " " + month + " " + day + " 입니다.");
    }
}
