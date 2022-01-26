package CHAPTER4;

import java.util.Scanner;

public class CH4_3 {
    public static void main(String[] args) {
        System.out.print("숫자를 입력 하세요 : ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        if (input == 0) {
            System.out.println("입력 숫자는 0 입니다.");
        }
        else {
            System.out.printf("입력 숫자는 %d 입니다", input);
        }
    }
}