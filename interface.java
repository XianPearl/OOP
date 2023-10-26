/* WAP in JAVA to create an interface to demonstrate that all the methods which are declared in the interface must be defined
   in a class that implement the interface otherwise the class.    */

interface prog {
  void display();
}
abstract class B extends prog {
}
class A implements prog {
  public void display {
    System.out.println("1st program");
  }
}
class C extends B {
  public void display {
    System.out.println("display from abstract class");
  }
  public static void main(String args[]) {
    new A().display();
    new C().display();
  }
}

/*OUTPUT
  1st program
  display from abstract class   */

//WAP to demonstrate multiple inheritance using interface

interface i1 {
  void display();
}
interface i2 {
  void def();
}
class A implements i1, i2 {
   public void display() {
      System.out.println("displayed from i1");
   }
   public void def() {
      System.out.println("displayed from i2");
   }
   public static void main(String args[]) {
      new A().display();
      new A().def();
   }
}

/*OUTPUT
   display from i1
   display from i2   */

//Create a method interface in JAVA and try to implement that interface in some other class.

class i1 {
   interface i2 {
      void def();
   }
}
class B implements i1, i2 {
   public void def() {
      System.out.println("nested interface");
   }
   public static void main(String args[]) {
      new B().def();
   }
}

/*OUTPUT
   nested interface   */

//WAP to demonstrate the fact that an interface can be inherited from some other interfaces.  

interface i1 {
   void disp();
}
interface i2 extends i1 {
   void def();
}
class B implements i2 {
   public void display {
      System.out.println("inherited from i1");
   }
   public void def() {
      System.out.println("display from i2");
   }
   public static void main(String args[]) {
      new B().disp();
      new B().def();
   }
}

/*OUTPUT
   inherited from i1
   display from i2    */
