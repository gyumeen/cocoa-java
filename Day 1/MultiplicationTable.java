package net.honux;
import java.util.Scanner;

public class MultiplicationTable {
    
    private int start;
    private int end;
    
    public boolean getInputFromKeyboard() {
        
        Scanner s = new Scanner(System.in);
        System.out.println("시작단과 끝단을 입력해 주세요.(1-9)");
        
        int start = s.nextInt();
        int end = s.nextInt();
        
        if (start < 1 || end > 9 || start > end) {
            System.out.println("잘 좀 하라고! 선넘네!");
            return false;
        }
        this.start = start;
        this.end = end;
        return true;
    }
    
    public static void main(String[] args) {
        
        MultiplicationTable m = new MultiplicationTable();
        boolean valid = m.getInputFromKeyboard();
        
        while(!valid) {
            valid = m.getInputFromKeyboard();
        }
        m.printArgs();
    }
    
    private void printArgs() {
        System.out.println(this.start);
        System.out.println(this.end);
    }
}
