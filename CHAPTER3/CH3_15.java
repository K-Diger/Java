package CHAPTER3;

import java.util.Scanner;

public class CH3_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = ' ';

        System.out.printf("문자를 하나 입력하세요 : ");

        String input = sc.nextLine();
        ch = input.charAt(0); //()번째에 해당하는 문자를 가져온다.

        System.out.println(ch);

        if('0' <= ch && ch <= '9') {
            System.out.printf("입력하신 문자는 숫자입니다.");
        }
        if(('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
            System.out.println("입력하신 문자는 영문자 입니다.");
        }
    }
}
