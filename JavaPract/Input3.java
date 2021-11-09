package JavaPract;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;
import java.io.File;

public class Input3 {
    public static void main(String[] args) {
        try {
            File file = new File("out.txt");
            Scanner input = new Scanner(file);
            while (input.hasNextInt()){
                System.out.println(input.nextInt() * 1000);
            }
            input.close();
        } catch (FileNotFoundException e){
            e.printStackTrace(); //에러내용 출력하기
        }
    }
}
