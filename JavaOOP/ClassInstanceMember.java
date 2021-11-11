package JavaOOP;

class PICalc{
    // 클래스변수 vs 인스턴스변수
    // Static vs Null
    // 클래스 내에서 모든 인스턴스가 동일한 값을 가지는 변수
    static double PI = 3.14;
    static int base = 0;

    int op1, op2;
    public void setOperand(int left, int right)
    {
        this.op1 = left;
        this.op2 = right;
    }

    public void sum(){
        System.out.println(this.op1 + this.op2 + base);
    }
    public void avg(){
        System.out.println((this.op1 + this.op2 + base) / 2);
    }
}

public class ClassInstanceMember {
    public static void main(String[] args) {
        PICalc c1 = new PICalc();
        c1.setOperand(10, 20);
        PICalc.base = 10; //클래스변수 값 최초할당
        c1.sum();

        PICalc c2 = new PICalc();
        c2.setOperand(30, 40);
        c2.sum();
        PICalc.base = 20; //클래스변수 값 수정
        c2.sum();
    }
}
