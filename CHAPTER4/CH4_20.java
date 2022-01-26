package CHAPTER4;

import java.util.Scanner;

public class CH4_20 {
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
            for(;;) {
                System.out.print("계산할 값을 입력하세요 (계산종료 : 0, 프로그램 종료 : 99 : ");
                tmp = sc.nextLine();
                num = Integer.parseInt(tmp);

                if (num == 0)
                    break;
                if (num == 99)
                    break;
                switch (menu) {
                    case 1:
                        System.out.println(num*num);
                        break;
                        case 2 :
                            System.out.println(Math.sqrt(num));
                    case 3 :
                        System.out.println(Math.log(num));
                }
            }
        }
    }
}
