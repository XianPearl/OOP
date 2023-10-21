/* Create a class Complex for storing the real and imaginary parts of a complex number. The class should have static members to store
  the number of complex numbers created and display it. Write functions (static or non-static as required) to calculate.
  (i)  sum, difference and product of two complex numbers
  (ii) modules and compliment of a complex number
  Define required constructors and destructors of the class. Implement a class by a main function.  */

class Complex {
  double real;
  double imaginary;
  static int NOC = 0;
  Complex (double real, double imaginary) {
    this.real = real;
    this.imaginary = imaginary;
    NOC++;
  }
  static int getNOC() {
    return NOC;
  }
  static Complex add (Complex c1, Complex c2) {
    return new Complex (c1.real + c2.real, c1.imaginary + c2.imaginary);
  }
  static Complex substract (Complex c1, Complex c2) {
    return new Complex (c1.real - c2.real, c1.imaginary - c2.imaginary);
  }
  static Complex multiply (Complex c1, Complex c2) {
    return new Complex (c1.real * c2.real - c1.imaginary * c2.imaginary, c1.real * c2.imaginary + c1.imaginary * c2.real);
  }
  double modulus() {
    return Math.sqrt(real * real + imaginary * imaginary);
  }
  static Complex complement (Complex c1) {
    return new Complex (c1.real, -c1.imaginary);
  }
}
class Main {
  public static void main(String args[]) {
    Complex c1 = new Complex(3,4);
    Complex c2 = new Complex(5,6);
    System.out.println("Number of complex numbers created: " + Complex.getNOC());
    System.out.println("c1 = " + c1.real + "+" + c1.imaginary + "i");
    System.out.println("c2 = " + c2.real + "+" + c2.imaginary + "i");
    System.out.println("c1 + c2 = " + Complex.add(c1,c2).real + "+" + Complex.add(c1,c2).imaginary + "i");
    System.out.println("c1 - c2 = " + Complex.subtract(c1,c2).real + "+" + Complex.subtract(c1,c2).imaginary + "i");
    System.out.println("c1 * c2 = " + Complex.multiply(c1,c2).real + "+" + Complex.multiply(c1,c2).imaginary + "i");
    System.out.println("|c1| = " + c1.modulus());
    System.out.println("Complement of c1 = " + Complex.compliment(c1).real + "+" + Complex.compliment(c1).imaginary + "i");
  }
}

/*OUTPUT
  Numbers of complex numbers created: 2
  c1 = 3.0 + 4.0i
  c2 = 5.0 + 6.0i
  c1 + c2 = 8.0 + 10.0i
  c1 - c2 = -2.0 + -2.0i
  c1 * c2 = -9.0 + 38.0i
  |c1| = 5.0
  complement of c1 = 3.0 - 4.0i  */

//Create a class Point for storing the co-ordinates of a geometrical point. Write static function to calculate the distance between two points.

class Point {
  double x;
  double y;
  Point(double x, double y) {
    this.x = x;
    this.y = y;
  }
  static double distance(Point p1, Point p2) {
    return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
  }
}
class Main {
  public static void main (String args[]) {
    Point p1 = new Point(3.0, 4.0);
    Point p2 = new Point(5.0, 6.0);
    System.out.println("Distance between p1 and p2: " + Point.distance(p1, p2));
  }
}

/*OUTPUT
  Distance between p1 and p2: 2.8284271247461903   */

//WAP in java for nested and inner loops

class OC {
  private static String outerStaticString = "outerStaticString";
  private String outerNonStaticString = "outerNonStaticString";
  static class SNC {
    private static String staticNestedString = "staticNestedString";
    public void printStrings() {
      System.out.println("Outer Static String: " + outerStaticString);
      System.out.println("Static nested string: " + staticNestedString);
    }
  }
  class IC {
    private String innerNonStaticString = "innerNonStaticString";
    public void printStrings() {
      System.out.println("Outer non-static string: " + outerNonStaticString);
      System.out.println("Inner non-static string: " + innerNonStaticString);
    }
  }
  class Main {
    public static void main (String args[]) {
      OC.SNC sNC = new OC.SNC();
      sNC.printStrings();
      OC outerClass = new OC();
      OC.IC innerClass = outerClass.new IC();
      innerClass.printStrings();
    }
  }

/*OUTPUT
  Outer static string: outerStaticString
  Static nested string: staticNestedString
  Outer non-static string: outerNonStaticString
  Inner non-static string: innerNonStaticString   */
