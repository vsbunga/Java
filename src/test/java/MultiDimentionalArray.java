import javax.swing.plaf.synth.SynthOptionPaneUI;

public class MultiDimentionalArray
{
    public static void main(String[] args)
    {
        //int [][] n = new int[5][4];
        int [][] n = {{12,13,14},{15,16,17},{18,19,20}};

        for (int[] x : n)
        {
            for(int y[] : n)
            {
                System.out.print(y+"");
            }
            System.out.println("");
        }


        for(int i = 0; i < n.length; i++) {
            System.out.println("Size of n["+i+"]"+ " is  "+n[i].length);
        }

        //Display array contents in matrix form

        for (int i = 0; i < n.length; i++)
        {
            for (int j = 0; j < n[i].length; j++)
            {
                System.out.print(n[i][j]+"\t");
            }
            System.out.println();
        }
    }

}
