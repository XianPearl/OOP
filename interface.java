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
  
