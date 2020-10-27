import java.util.Scanner;

public class multiplicationtable
{
    static void multiplication()
    {
        System.out.println("Which number multiplication : ");
        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt();

        for (int i =1; i < 10; i++)
        {
            int k = j * i;
            System.out.println(j +" * "+i+" = " + k);
        }
    }



    public static void main(String[] args)
    {
        multiplication();
    }

}
