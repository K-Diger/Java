package CHAPTER4;

import java.util.Scanner;

public class CH4_15 {
    public static void main(String[] args) {
        int input = 0, answer = 0;

        answer = (int)(Math.random() * 100) + 1;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("1과 100사이의 정수 : ");
            input = sc.nextInt();

            if(input > answer) {
                System.out.println("입력값을 낮추시오");
            } else if (input < answer) {
                System.out.println("입력값을 더 키우시오");
            }
        } while (input != answer);

        System.out.println("정답");
    }
}
