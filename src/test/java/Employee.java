public class Employee {

    int EmpNo;
    String EmpName;
    Float EmpSal;

    void Dataset()
    {
        EmpNo = 101;
        EmpSal = 2121.03f;
        EmpName = "Satya";
    }

    public static void main(String[] args)
    {
        Employee Emp = new Employee();

        Emp.EmpNo = 102;
        Emp.EmpSal = 221.03f;
        Emp.EmpName = "Bunga";
        System.out.println(Emp.EmpName+"\t" + Emp.EmpSal+"\t" + Emp.EmpNo);
        Emp.Dataset();



        System.out.println(Emp.EmpName+"\t" + Emp.EmpSal+"\t" + Emp.EmpNo);

    }



}
