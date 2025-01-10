class Employee
{
    String Name;
    double Salary;
    int Noh;

    public void setInfo(String Name, double Salary, int Noh)
    {
        this.Name = Name;
        this.Salary = Salary;
        this.Noh = Noh; //No.of.hours
    }

    public void getInfo()
    {
        System.out.println("Name: "+Name);
        System.out.println("Salary: "+Salary);
        System.out.println("No.of.Hours: "+Noh);
    }

    public void addInfo()
    {
        if(Noh>8)
        {
            Salary += Salary*0.1;
        }
    }
}


public class Main3 
{
    public static void main(String args[])
    {
        Employee emp = new Employee();
        emp.setInfo("Nitish",20000,9);
        emp.setInfo("Sasi",24000,6);
        emp.addInfo();
        emp.getInfo();
    }
    
}
