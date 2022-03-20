package CHAPTER6;

class MyMath2 {

    //인스턴스 메서드
    //인스턴스변수 a, b 만을 이용 -> 매개변수가 필요 없다.
    //////////////////////////////////////////
    long a, b;

    long add() {
        return a + b;
    }

    long sub() {
        return a - b;
    }

    long mul() {
        return a * b;
    }

    double div() {
        return a / b;
    }
    
    //Static 메서드 (클래스 메서드)
    ////////////////////////////////////////////
    // 인스턴스 변수와 관계없이 매개변수만으로 작업이 가능하다.

    static long add(long a, long b) {
        return a + b;
    }

    static long sub(long a, long b) {
        return a - b;
    }

    static long mul(long a, long b) {
        return a * b;
    }

    static double div(double a, double b) {
        return a / b;
    }
}

public class CH6_9 {
    public static void main(String[] args) {
        System.out.println();
    }
}
