package JavaPract;

import java.util.Scanner;
import java.util.*;

public class Input1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Scanner file_read = new Scanner(FileName); -> 파일 내용을 읽음
        int i = input.nextInt();
        String test = input.nextLine();

        System.out.println(i*100);
        System.out.println(test);

        input.close();
    }
}
