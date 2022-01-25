package CHAPTER3;

public class CH3_14 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = new String("abc");

        System.out.println("abc" == "abc");
        System.out.println("str1" == "str1");
        System.out.println("str1" == "str2");
        System.out.println("str1" == "str2");

        System.out.println(str1.equals("abc"));
        System.out.println(str2.equals("abc"));
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals("str2"));
    }
}
