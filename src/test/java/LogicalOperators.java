public class LogicalOperators {

    public static void main(String[] args)
    {

        int a = 10, b = 20, c = 30;

        boolean result = ((a>b++) & (a>c++));
        System.out.println(result);
        System.out.println(b);
        System.out.println(c);

        large(2,3);

    }

    static void large(int x, int y)
    {
        int large = (x>y)?x:y;
        System.out.println(large);
    }


}
