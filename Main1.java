import java.util.Scanner;
class Average
{
    public double Avg(int a, int b, int c, int d, int e)
    {
        return(a+b+c+d+e)/5.0;
    }
    public void printAvg(double average)
    {
        System.out.println("The Average is: " +average);
    }
}
public class Main1 
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 integer:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();

        Average avg = new Average();
        double Avg = avg.Avg(a,b,c,d,e);
        avg.printAvg(Avg);
        scanner.close();
    }
}
