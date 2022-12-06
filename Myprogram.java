import java.io.*;
import java.util.*;

class Circle 
{
    double p;
    double a;
    void area(double r) {
        a = 3.14*r*r;
        System.out.println("\n Area of Circle= "+a);
    }
    void perimeter(double r)
    {
        p = 2 * 3.14 * r;
        System.out.println("\n Perimeter of Circle = " +p ); 
    }
}

class Myprogram {
    public static void main(String args[]){
        double r;
        Scanner in = new Scanner(System.in);
        Circle m = new Circle();
        System.out.println("Enter Radius: ");
        r = in.nextDouble();
        m.area(r);
        m.perimeter(r);
    }
}