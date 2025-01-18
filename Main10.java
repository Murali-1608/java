import java.util.Scanner;
class Cuboid 
{
    int len;
    int width;
    int height;

    public Cuboid(int len, int width, int height)
    {
        this.len = len;
        this.width = width;
        this.height = height;
    }

    public int Volume()
    {
        return len * width * height;
    }

    public class Point
    {
        double x;
        double y;
        double z;

        public boolean setX(double x)
        {
            if(x>=0 && x<=len)
            {
                this.x = x;
                return true;
            }
            return false;
        }

        public boolean setY(double y)
        {
            if(y>=0 && y<=width)
            {
                this.y = y;
                return true;
            }
            return false;
        }

        public boolean setZ(double z)
        {
            if(z>=0 && z<=height)
            {
                this.z=z;
                return true;
            }
            return false;
        }

        public String getPointDetails(double x,double y,double z)
        {
            return "Point(x=" +x+",y="+y+",z="+z+")";
        }
    }
}

public class Main10
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length: ");
        int len = scanner.nextInt();

        System.out.print("Enter Width: ");
        int width = scanner.nextInt();

        System.out.print("Enter Height: ");
        int height = scanner.nextInt();

        Cuboid V = new Cuboid(len, width, height);
        System.out.println("Volume of the cuboid: "+V.Volume());

        Cuboid.Point point = V.new Point();

        System.out.print("Enter x coordinate: ");
        double x =scanner.nextDouble();

        System.out.print("Enter y coordinate: ");
        double y = scanner.nextDouble();

        System.out.print("Enter z coordinate: ");
        double z = scanner.nextDouble();

        System.out.println("Points in the cuboid: "+point.getPointDetails(x,y,z));
        scanner.close();
    }
}