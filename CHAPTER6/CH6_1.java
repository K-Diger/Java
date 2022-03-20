package CHAPTER6;

public class CH6_1 {
    //객체지향언어의 주요 특징
    //1. 코드의 재사용성이 높다
    //2. 코드의 관리가 용이하다.
    //3. 신뢰성이 높은 프로그래밍을 가능하게 한다.

    public static void main(String[] args) {
        Tv t;
        t = new Tv();
        t.channel = 7;
        t.channelDown();
        System.out.println(t.channel);
    }
}

class Tv {
    //멤버변수
    String color;
    boolean power;
    int channel;

    //메서드
    void power() {
        power = !power;
    }
    void channelUp() {
        ++channel;
    }
    void channelDown() {
        --channel;
    }
}
