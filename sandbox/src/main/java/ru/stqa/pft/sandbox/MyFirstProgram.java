package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void oldmain (String[] arg) {

    hello("world");
    hello("user");
    hello("Andrey");

    Square s = new Square(5);
    System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(4, 6);
    System.out.println("Площадь прямоугольника со сторонами "+ r.a + " и " + r.b + " = " + r.area());

  }

  public static void hello(String somebody) {

    System.out.println("Hello, " + somebody + "!");

  }

  public static double distance(Point p1, Point p2) {
    double a = p1.x1 - p2.x1;
    double b = p1.y1 - p2.y1;
    double result = Math.sqrt((a * a) + (b * b));

    return result;
  }

}
