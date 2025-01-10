class DoctorAndFree
{
    static double doctorFee;
    String doctorName;
    
    static void dispFee()
    {
        doctorFee = 500.0;
        //System.out.println("Doctor Fee: "+doctorFee);
    }

    void dispdoctorName()
    {
        this.doctorName = "Dr.Rajesh";
        System.out.println("Doctor Name: "+this.doctorName);
        System.out.println("Doctor Fee: "+doctorFee);
    }    
}

public class Main5 
{
    public static void main(String args[])
    {
        double doctorFee = 450.0;
        System.out.println("Doctor Fee: "+doctorFee);

        DoctorAndFree doc = new DoctorAndFree();
        doc.doctorName = "Dr.Ram";
        System.out.println("Doctor Name: "+doc.doctorName);
        
        DoctorAndFree.dispFee();
        doc.dispdoctorName();
    
    }   
    
}