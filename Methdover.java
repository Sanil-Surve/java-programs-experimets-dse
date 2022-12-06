import java.io.*;
import java.util.*;

class Meth 
{
    int rarea;
    double carea;
    void area(int l, int b)
    {
        rarea = l * b;
        System.out.println("\n Area of Rectangle: "+rarea);
    }
    void area(double r)
    {
        carea = 3.14*r*r;
        System.out.println("\n Area of circle: "+carea);
    };
};

class Methdover
{
    public static void main(String args[]) {
        int l,b;
        double r;
        Scanner in = new Scanner(System.in);
        Meth m = new Meth();
        System.out.println("Enter Length & Breath");
        l = in.nextInt();
        b = in.nextInt();
        m.area(l,b);
        System.out.println("Enter Radius ");
        r = in.nextDouble();
        m.area(r);
        
    };
};