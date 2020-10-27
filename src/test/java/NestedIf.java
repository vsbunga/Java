import java.sql.SQLOutput;
import java.util.SortedMap;

public class NestedIf
{

    //Largest among numbers

    public static void main(String[] args)
    {

        int a = 10, b = 20, c = 30, large;

        if(a>b)
        {
            if(a>c)
            {
                large = a;
            }
            else
                large = c;
        }
        else
        {
           large = c;
        }

        System.out.println(large);

    }


}
