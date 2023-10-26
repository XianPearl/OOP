/* WAP in JAVA to implement the concept of method overriding?
   WAP in JAVA to modify the above program to demonstrate the fact that in the event of inheritance involving super class
   and sub classes methods with same name but different type signatures are not overridden but actually overloaded.   */

class SuperClass {
  void display() {
    System.out.println("This is the SuperClass");
  }
}
class SubClass extends SuperClass {
  void display() {
    System.out.println("This is the SubClass");
  }
  void display(int x) {
    System.out.println("This is the SubClass with integer parameter" + x);
  }
}
class Main {
  public static void main(String args[]) {
    SuperClass superClass = new SuperClass();
    superClass.display();
    SubClass subClass = new SubClass();
    subClass.display();
    subClass.display(10);
    SuperClass superClass2 = new SubClass();
    superClass2.display();
  }
}

/*OUTPUT
  This is the SuperClass
  This is the SubClass
  This is the SubClass with integer parameter 10
  This is the SubClass       */

//WAP in JAVA to implement dynamic dispatch

class SuperClass {
  void display() {
    System.out.println("This is the SuperClass");
  }
}
class SubClass extends SuperClass {
  void display() {
    System.out.println("This is the SubClass");
  }
}
class Main {
  public static void main(String args[]) {
    SuperClass superClass = new SuperClass();
    superClass.display();
    SubClass subClass = new SubClass();
    subClass.display();
    SuperClass superClass2 = new SubClass();
    superClass2.display();
  }
}

/*OUTPUT
  This is the SuperClass
  This is the SubClass
  This is the SubClass  */

/* Create a class 2D figure that contains data members to represent dimensions and a method calc() to calculate
   the corresponding area that derives 2 classes rectangle and triangle from 2D figure and calculate their
   corresponding area.    */

abstract class Figure2D {
  double dim1, dim2;
  Figure2D(double a, double b) {
    dim1 = a;
    dim2 = b;
  }
  abstract double calc();
}
class Rectangle extends Figure2D {
  Rectangle(double a, double b) {
    super(a, b);
  }
  double calc() {
    return dim1*dim2;
  }
}
class Triangle extends Figure2D {
  Triangle(double a, double b) {
    super(a, b);
  }
  double calc() {
    return dim1*dim2/2;
  }
}
class Main {
  public static void main (String args[]) {
    Rectangle r = new Rectangle(10, 20);
    double area = r.calc();
    System.out.println("Area of rectangle: " + area);
    Triangle t = new Triangle(10, 20);
    area = t.calc();
    System.out.println("Area of traingle: "  area);
  }
}

/*OUTPUT
  Area of rectangle: 200.0
  Area of triangle: 100.0   */
