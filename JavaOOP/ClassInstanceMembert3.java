package JavaOOP;

// 1. 인스턴스 메소드는 클래스 멤버에 접근 불가 -> 클래스가 이미 존재하기 때문에, 해당하는 클래스의 메소드를 사용해야함
// 2. 클래스 메소드는 인스턴스 멤버에 접근 불가

class C1{
    static int static_variable = 1; //클래스 변수
    int instance_variable = 2; // 인스턴스 변수

    // 클래스 메소드
    static void static_static(){
        System.out.println(static_variable);
    }
    static void static_instance(){ //클래스 메소드에서 인스턴스 변수에 접근할때
        // System.out.println(instance_variable);
    }

    // 인스턴스 메소드
    void instance_static(){
        System.out.println(static_variable);
    }
    void instance_instance(){
        System.out.println(instance_variable);
    }
}

public class ClassInstanceMembert3 {
    public static void main(String[] args) {
        C1 c = new C1();

        c.static_static();
        c.instance_static();
        c.instance_instance();
        c.static_instance();

    }
}
