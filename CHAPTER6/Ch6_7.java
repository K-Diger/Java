package CHAPTER6;

//참조형 매개변수 - 객체를 매개변수로 받아서 변수를 읽고 쓰기 할 수 있다. ---> 매개변수 객체의 주소를 받아오기 때문에 해당 주소에 대한 값을 변경하므로 쓰기가 되는 것이다.
public class Ch6_7 {
    public static void main(String[] args) {
        Data2 d = new Data2();
        d.x = 10;
        System.out.println(d.x);

        change(d);
        System.out.println(d.x);
    }

    static void change(Data2 d) {
        d.x = 1000;
        System.out.println(d.x);
    }
}

class Data2 {
    int x;
}