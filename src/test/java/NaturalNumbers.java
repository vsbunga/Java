import java.sql.SQLOutput;

public class NaturalNumbers

{
    public static void main(String[] args)
    {
        forloopPrintNnumbers(15);
        //whileloop();
    }

    static void forloopPrintNnumbers(int i)
    {
        System.out.println("First 10 natural numbers are");

        for (int n =1 ; n <= i ; n++)
        {
            if (n==i)
            {
                System.out.print(n);
            }
            else {
                // System.out.println(n);
                System.out.print(n + ", ");
            }
        }
    }

    static void whileloop()
    {
        System.out.println("First 10 natural numbers are");
        int n = 1;
        while(n <= 10)
        {
            System.out.println(n);
            n = n+1;
        }
    }



}
