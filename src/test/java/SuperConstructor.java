class product{
    product()
    {
        System.out.println("This is a Product Constructor");
    }
}

class computer extends product{
    computer()
    {
        System.out.println("This is a computer Constructor");
    }
}




public class SuperConstructor {
    public static void main (String[] args)
    {
        computer obj = new computer();
    }
}
