package CHAPTER2;

public class CH2_9 {
    public static void main(String[] args) {
        String url = "www.test.com";
        float f1 = .10f;
        float f2 = 1e1f;
        float f3 = 3.14e3f;
        double d = 1.23456789;
        System.out.printf("%f, %e, %g", f1, f1, f1);
        System.out.printf("%f, %e, %g", f2, f2, f2);
        System.out.printf("%f, %e, %g", f3, f3, f3);

        System.out.printf("%20s", url);
        System.out.printf("%5s", url);
    }
}
