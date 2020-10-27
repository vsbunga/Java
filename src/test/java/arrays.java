import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class arrays {

    public static void main(String[] args)
    {
        String[] subject = new String[5];

        int[] marks = {31,32,33,34,35};

        System.out.println( marks[(marks.length)-1]);


        for (int i =0; i<5; i++)
        {

           System.out.println("Marks of subject -"+ i + "are     "+ marks[i]);


        }

        System.out.println(subject[4]);

    }
}
