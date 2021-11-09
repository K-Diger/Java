package JavaPract;

import java.util.Scanner;
import java.util.*;

public class Input2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(input.hasNextInt()){
            System.out.println(input.nextInt() * 1000);
        }
        input.close();
    }
}
