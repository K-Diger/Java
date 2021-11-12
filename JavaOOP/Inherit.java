package JavaOOP;

class CalculatorInherit {
    int left, right;

    public void setOperands(int left, int right) {
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

class SubstractionableCalculator extends CalculatorInherit {
    public void substract() {
        System.out.println(this.left - this.right);
    }
}

// 상속받은 클래스로부터 상속받은 클래스
class MultiplyCalculoator extends SubstractionableCalculator {
    public void multiply() {
        System.out.println(this.left * this.right);
    }
}

public class Inherit {

    public static void main(String[] args) {

        MultiplyCalculoator c1 = new MultiplyCalculoator();
        c1.setOperands(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();
        c1.multiply();
    }
}