package JavaOOP;
// 클래스 메소드
// 1. 메소드에 static 키워드 지정
// 2. 메소드에 매개변수 지정

class Calculator3{
    public static void sum(int op1, int op2){
        System.out.println(op1 + op2);
    }
    public static void avg(int op1, int op2){
        System.out.println((op1 + op2) / 2);
    }
}

public class ClassInstanceMember2 {
    public static void main(String[] args) {
        Calculator3.sum(10, 20);
        Calculator3.avg(10, 20);

        Calculator3.sum(20, 40);
    }
}
