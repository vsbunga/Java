
class base {
    int a = 10, b = 20;
    void A()
    {
        System.out.println("this is a base method A");
    }
}
//derived class
class derived extends base{
   int a = 12, c = 30, d = 40;
    void B()
    {
        System.out.println("This is a derived method B");
    }
}





class Inheritance {

    public static void main(String[] args)
    {
        derived obj = new derived();
        System.out.println(obj.a +"\t"+obj.b +"\t"+obj.c +"\t"+obj.d +"\t");
        obj.a = 11;
    }
}
