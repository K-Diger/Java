package CHAPTER4;

public class CH4_16 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

        while(true) {
            if(sum > 100)
                break;
            ++i;
            sum += i;
        }

        System.out.println(i);
        System.out.println(sum);
    }
}
