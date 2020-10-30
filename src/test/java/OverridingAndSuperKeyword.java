
class baseA{
    int a = 10, b = 20;
    void baseA()
    {
        System.out.println("This is a base Method");
    }
}
class derivedA extends baseA {
    int a = 12, b = 22;

    void derivedA()
    {
        System.out.println("This is a derivedA method ");
        System.out.println(super.a +"\t" +super.b);
    }
}



public class OverridingAndSuperKeyword {

    public static void main(String[] args)
    {
        derivedA obj = new derivedA();
        System.out.println(obj.a + "\t"+obj.b);
        obj.derivedA();
    }
}
