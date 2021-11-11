package JavaOOP;

class AdvancedCalculator{
    int op1, op2;
    public void setOperand(int left, int right)
    {
        this.op1 = left;
        this.op2 = right;
    }

    public void sum(){
        System.out.println(this.op1 + this.op2);
    }
    public void avg(){
        System.out.println((this.op1 + this.op2) / 2);
    }
}

public class ClassInstanceObject4 {
    public static void main(String[] args) {
        AdvancedCalculator c1 = new AdvancedCalculator();
        c1.setOperand(10, 20);
        c1.sum();
        c1.avg();

        AdvancedCalculator c2 = new AdvancedCalculator();
        c2.setOperand(30, 50);
        c2.sum();
        c2.avg();
    }
}