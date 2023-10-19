/* Create a box class and add a method set data to initialise the data members. Add another method which will calculate 
  the volume of the box. Create one rectangular box and a cube and find which box is bigger. */

class Box {
  double width, height, depth;
  void set (double w, double h, double d) {
    width = w;
    height = h;
    depth = d;
  }
  double calcvol() {
    return (width * height * depth);
  }
}

class BoxDemo {
  public static void main (String args[]) {
    Box myBox1 = new Box();
    Box myBox2 = new Box();
    myBox1.set(12, 10.0, 5);
    myBox2.set(10.0, 10, 10);
    System.out.print("The bigger box is ");
    if (myBox1.calcvol() > myBox2.calcvol())
      System.out.println ("Rectangle");
    else
      System.out.println ("Cube");
  }
}

/*OUTPUT
  javac Box.java
  java BoxDemo
  The bigger box is cube */

//Rewrite the abive program using normal as well as parameterized constructor

//normal constructor
class Box {
  double width, height, depth;
  Box() {
    width = 10;
    height = 5;
    depth = 6;
  }
  double calcvol() {
    return (width * height * depth);
  }
}

class BoxDemo {
  public static void main (String args[]) {
    Box myBox = new Box();
    System.out.println("The volume of box is : " + myBox.calcvol());
  }
}

//Parameterized constructor
class Box {
  double width, height, depth;
  Box (double w, double h, double d) {
    width = w;
    height = h;
    depth = d;
  }
  double calcvol() {
    return (width * height * depth);
  }
}

double BoxDemo {
  public static void main (String args[]) {
    Box myBox = new Box(12, 10, 5);
    System.out.println("The volume of box is : " + myBox.calcvol());
  }
}

/*OUTPUT
  
  //normal constructor
  javac Box.java
  java BoxDemo
  The volume of box is : 300.0

  //Parameterized constructor
  javac Box.java
  java BoxDemo
  The volume of box is : 600.0  */
