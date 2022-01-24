package CH2;

public class CH2_12 {
    public static void main(String[] args) {
        String test = "3";

        System.out.println(test.charAt(0) - '0'); //charAt(0) 으로 문자열 변환
        System.out.println('3' - '0' + 1);
        System.out.println(Integer.parseInt("3")+1); //parseInt()로 정수형 변환
    }
}
