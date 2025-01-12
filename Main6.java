class Person
{
   String  name;
   String address;
   String mobile;

   public Person(String name, String mobile)
   {
    this.name = name;
    this.mobile = mobile;
   }

   public void setAddress(String address)
   {
    this.address = address;
   }
   public String getName()
   {
    return name;
   }
   public String getAddress()
   {
    return address;
   }
   public String getMobile()
   {
    return mobile;
   }
}

class Student extends Person
{
        int year;
        double fee;
        String course; 
        
        public Student(String name, String mobile, double fee)
        {
            super(name, mobile);
            this.fee = fee;
        }
        public void setCourse(String course)
        {
            this.course = course;
        }
        public void setYear(int year)
        {
            this.year = year;
        }
        public int getYear()
        {
            return year;
        }
        public String getCourse()
        {
            return course;
        }
        public double getFee()
        {
            return fee;
        }
}

class Staff extends Person
{
    String college;
    double salary;

    public Staff(String name, String mobile, String college)
    {
        super(name,mobile);
        this.college = college;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }
    public String getCollege()
    {
        return college;
    }
    public double getSalary()
    {
        return salary;
    }
}


public class Main6 
{
    public static void main(String args[])
    {
        Student stud = new Student("Ram","9448823456",15000.0);
        stud.setAddress("123 Raj Street");
        stud.setCourse("Maths");
        stud.setYear(3);

        Staff staff = new Staff("Mahesh","9870123653","ABC College");
        staff.setAddress("Rms Street");
        staff.setSalary(35000.0);

        System.out.println("Student Details");
        System.out.println("Name: "+stud.getName());
        System.out.println("Address: "+stud.getAddress());
        System.out.println("Mobile: "+stud.getMobile());
        System.out.println("Course: "+stud.getCourse());
        System.out.println("Year: "+stud.getYear());
        System.out.println("Fee: "+stud.getFee());

        System.out.println("Staff Details");
        System.out.println("Name: "+staff.getName());
        System.out.println("Address:"+staff.getAddress());
        System.out.println("Mobile: "+staff.getMobile());
        System.out.println("College: "+staff.getCollege());
        System.out.println("Salary:" +staff.getSalary());


    }
    
}
