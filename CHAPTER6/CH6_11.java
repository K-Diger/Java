package CHAPTER6;


class Data_1 {
    int value;
}

class Data_2 {
    int value;

    Data_2(int x) {
        value = x;
    }
}

public class CH6_11 {
    public static void main(String[] args) {
        int x = 1;
        Data_1 d1 = new Data_1();
        Data_2 d2 = new Data_2(x);
        // Data_2 d2 = new Data_2(); 생성자에 매개변수를 넣어줘야함.
    }
}
