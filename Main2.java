class Employee
{
    String Name;
    double Salary;
    int Noh;

    public void setInfo(String Name, double Salary, int Noh)
    {
        this.Name = Name;
        this.Salary = Salary;
        this.Noh = Noh;
    }
    public void getInfo()
    {
        System.out.println("Name: "+ Name);
        System.out.println("Salary: "+Salary);
        System.out.println("No.Of.Hours: "+Noh);
    }
}
public class Main2 
{
    public static void main(String args[])
    {
        Employee emp = new Employee();
        emp.setInfo("Sasi",25000,8);
        emp.getInfo();
    }
}
