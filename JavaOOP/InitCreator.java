package JavaOOP;

class CalculatorInitCreator {
    int left, right;

    //생성자(Constructor) 클래스 이름과 동일한 생성자는 클래스 실행 즉시 실행되는 함수 -> Like python __init__
    public CalculatorInitCreator(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println(this.left + this.right);
    }

    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}

public class InitCreator {

    public static void main(String[] args) {

        CalculatorInitCreator c1 = new CalculatorInitCreator(10, 20);
        c1.sum();
        c1.avg();

        CalculatorInitCreator c2 = new CalculatorInitCreator(20, 40);
        c2.sum();
        c2.avg();
    }
}
