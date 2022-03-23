package CHATPER7;

public class CH7_8 {

    public static void main(String[] args) {
        Buyer b = new Buyer();
        b.buy(new Tv1());
        b.buy(new Computer());
        System.out.println(b.money);
        System.out.println(b.bonusPoint);
    }
}


class Product {
    int price;
    int bonusPoint;

    Product(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }
}

class Tv1 extends Product {
    Tv1() {
        super(1000);
    }

    public String toString() {
        return "Tv";
    }
}

class Computer extends Product {
    Computer() {
        super(2000);
    }

    public String toString() {
        return "Computer";
    }
}

class Buyer {
    int money = 1000;
    int bonusPoint = 0;

    void buy(Product product) {
        if (money < product.price) {
            System.out.println("잔액이 부족합니다");
            return;
        }

        money -= product.price;
        bonusPoint += product.bonusPoint;
        System.out.println(product + "를 구매하셨습니다.");
    }
}