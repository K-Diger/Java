package CHAPTER6;

public class CH6_2 {
    public static void main(String[] args) {
        Tv t1 = new Tv();
        Tv t2 = new Tv();
        System.out.println("t1 Channel = " + t1.channel);
        System.out.println("t2 Channel = " + t2.channel);
        
        t1.channel = 7;
        System.out.println("t1 채널 변경" + t1.channel);
        System.out.println("t2 채널 변경없음" + t2.channel);
    }
}
