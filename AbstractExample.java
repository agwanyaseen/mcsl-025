import java.util.*;

abstract class Shape 
{
    public abstract void Find_Area();
}

class Circle extends Shape
{
    public void Find_Area()
    {
        System.out.println("----------------Circle---------------------");
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Radius of circle : ");
        double radius = sc.nextDouble();
        double area = 3.14 * radius * radius;
        System.out.println("Areas of Circle is "+area);
    }
}

class Rectangle extends Shape
{
    public void Find_Area()
    {
        System.out.println("--------Rectangle---------------------");
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Length of Rectangle:");
        double length = sc.nextDouble();
        System.out.print("Input Width of Rectangle:");
        double width = sc.nextDouble();
        double area = width * length;
        System.out.println("Areas of Rectangle is "+area);
    }
}


class AbstractExample
{
    public static void main(String[] args)
    {
        //Calculating Area of Rectangle
        Shape rectangle = new Rectangle();
        rectangle.Find_Area(); 

        Shape circle = new Circle();
        circle.Find_Area();

    } 
}