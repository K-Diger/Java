package CHAPTER4;

import java.util.Scanner;

public class CH4_18 {
    public static void main(String[] args) {
        int menu = 0;
        int num = 0;

        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("(1) square");
            System.out.println("(2) square root");
            System.out.println("(3) log");
            System.out.println("원하는 메뉴를 선택하세요. (종료:0) : ");

            String tmp = sc.nextLine();
            menu = Integer.parseInt(tmp);

            if (menu == 0) {
                break;
            } else if (!(1 <= menu && menu <= 3)) {
                System.out.println("메뉴를 잘못 선택하셨습니다");
                continue;
            }
            System.out.println(menu);
        }
    }
}
