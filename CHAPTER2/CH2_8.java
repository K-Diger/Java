package CHAPTER2;

public class CH2_8 {
    public static void main(String[] args) {
        int x = 10, y = 5;
        System.out.println(x);
        System.out.println(y);

        int temp;
        temp = x;
        x = y;
        y = temp;
        System.out.println(x);
        System.out.println(y);
    }
}
