package CHAPTER3;

public class CH3_17 {
    public static void main(String[] args) {
        int x, y, z;
        int absX, absY, absZ;
        char signX, signY, signZ;

        x = 10;
        y = -5;
        z = 0;

        absX = x >= 0 ? x : -x;
        absY = y >= 0 ? y : -y;
        absZ = z >= 0 ? z : -z;

        signX = x > 0 ? '+' : ( x == 0 ? ' ' : '-');
        signY = y > 0 ? '+' : ( y == 0 ? ' ' : '-');
        signZ = z > 0 ? '+' : ( z == 0 ? ' ' : '-');

        System.out.println(absX);
        System.out.println(absY);
        System.out.println(absZ);
        System.out.println(signX);
        System.out.println(signY);
        System.out.println(signZ);
    }
}
