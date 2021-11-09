package JavaPract;

public class IfSyntax
{
    public static void main(String[] args)
    {
        int x = 5, y = 10;

        while(true)
        {
            if(x == y)
            {
                System.out.println("참");
                break;
            }
            else
            {
                x++;
            }
        }

    }
}
