/* Create a class with data members and all possible types of constructors so as to implement constructor overloading. Use a display method to demonstrate the calling 
  of each type of constructor.  */

class myClass {
  int x;
  String y;
  myClass() {
    x = 0;
    y = "default";
  }
  myClass(int x, String y) {
    this.x = x;
    this.y = y;
  }
  myClass(myClass Obj) {
    x = obj.x;
    y = obj.y;
  }
  void display() {
    System.out.println("x : " + x + ", y : " + y);
  }
}
class Main {
  public static void main (String args[]) {
    myClass obj1 = new myClass();
    myClass obj2 = new myClass(10, "Hello");
    myClass obj3 = new myClass(obj2);
    obj1.display();
    obj2.display();
    obj3.display();
  }
}

/*OUTPUT
  x : 0, y : default
  x : 10, y : Hello
  x : 10, y : Hello */

//Create a class having a copy constructor. Add a method to check and return whether two objects of the class are equal or not.

class myClass {
  int x;
  String y;
  myClass(int x, String y) {
    this.x = x;
    this.y = y;
  }
  myClass(myClass Obj) {
    this.x = obj.x;
    this.y = obj.y;
  }
  public boolean isSame(myClass obj) {
    if (this.y.equals(obj.y) && this.x == obj.x) 
      return true;
    else
      return false;
  }
  void display() {
    System.out.println("x : " + x + ", y : " + y);
  }
}
class Main {
  public static void main (String args[]) {
    myClass obj1 = new myClass(10, "Hello");
    myClass obj2 = new myClass(obj1);
    myClass obj3 = new myClass(12, "Heyyy");
    obj1.display();
    obj2.display();
    obj3.display();
    System.out.println("Are obj1 and obj2 same?" + obj1.isSame(obj2));
    System.out.println("Are obj1 and obj3 same?" + obj1.isSame(obj3));
  }
}

/*OUTPUT
  x : 10, y : Hello
  x : 10, y : Hello
  x : 12, y : Heyyy
  Are obj1 and obj2 same? true
  Are obj1 and obj3 same? false  */

//Demonstrate method overloading with a suitable example involving implicit type casting.

class Calculator {
  int add(int a, int b) {
    return a+b;
  }
  double add(double a, double b) {
    return a+b;
  }
  double add(int a, double b) {
    return a+b;
  }
}
class Main {
  public static void main (String args[]) {
    Calculator c = new Calculator();
    int result1 = c.add(10,20);
    System.out.println("The sum of 10 and 20 is " + result1);
    double result2 = c.add(10.5, 20.5);
    System.out.println("The sum of 10.5 and 20.5 is " + result2);
    double result3 = c.add(10, 20.5);
    System.out.println("The sum of 10 and 20.5 is " + result3);
  }
}

/*OUTPUT
  The sum of 10 and 20 is 30
  The sum of 10.5 and 20.5 is 31.0
  The sum of 10 and 20.5 is 30.5  */

//WAP that contains as a data member of a class, a method that returns objects.

class Point {
  int x;
  Point (int x) {
    this.x = x;
  }
  Point add (Point p) {
    Point result = new Point(this.x + p.x);
    return result;
  }
  public void display() {
    System.out.println("The x-coordinate is " + x);
  }
}
class Main {
  public static void main (String args[]) {
    Point p1 = new Point(10);
    p1.display();
    Point p2 = new Point(20);
    p2.display();
    Point p3 = p1.add(p2);
    p3.display();
  }
}

/*OUTPUT
  The x-coordinate is 10
  The x-coordinate is 20
  The x-coordinate is 30  */

//WAP to create a class containing static data members. Initialize the members using static blocks.

public class MyClass {
  static int num1;
  static int num2;
  static {
    num1 = 10;
    num2 = 20;
  }
  public static void main (String args[]) {
    System.out.println("num1: " + num1);
    System.out.println("num2: " + num2);
  }
}

/*OUTPUT
  num1: 10
  num2: 20  */
