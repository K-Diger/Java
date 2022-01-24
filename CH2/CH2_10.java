package CH2;

import java.util.Scanner;

public class CH2_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("두자리 정수를 입력하세요 : ");
        String input = sc.nextLine();
        int num = Integer.parseInt(input); //int로 변환

        System.out.println("입력내용 : " + input);
        System.out.printf("num = %d", num);
    }
}
