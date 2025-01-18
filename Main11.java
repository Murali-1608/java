class InkPen
{
    public void write()
    {
        System.out.println("The ink pen writes better.");
    }
}
public class Main11 
{
    public static void main(String args[])
    {
        InkPen redInkPen = new InkPen()
        {
            public void write()
            {
                System.out.println("The Red Ink pen writes smoothly at this cost ");
            }
        };
        redInkPen.write();
    }
}
