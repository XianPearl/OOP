/* WAP in JAVA to implement exception handling using try catch block. The code inside try block should throw atleast 3 exceptions 
  which should be caught using individual catch classes.   */

public class EHI {
  public static void main(String args[]) {
    try {
      int arr[] = new int[10];
      arr[10] = 100;   //ArrayOutOfBoundException
      int a = 10, b = 0;
      int c = a/b;  //ArithmeticException
      String str = "abc";
      int x = Integer.parseInt(str);  //NumberFormatException
    }catch(ArrayIndexOutOfBoundsException e) {
      System.out.println("ArrayIndexOutOfBoundsException caught: " + e);
    }catch(ArithmeticException e) {
      System.out.println("ArithmeticException caught: " + e);
    }catch(NumberFormatException e) {
      System.out.println("NumberFormatException caught: " + e);
    }
  }
}

/*OUTPUT
  ArrayIndexOutOfBoundsException caught: java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10  */

/* WAP in JAVA to implement exception handling using nested try blocks. In order to do that the code must throw atleast 2
  different exceptions.  */

public class EH2 {
  public static void main(String args[]) {
    try {
      int a = args.length;
      int b = 42/a;
      System.out.println("a = " + a);
      try {
        if (a == 1)
          a = a/ (a - a);
        if (a == 2) {
          int c[] = {1};
          c[42] = 99;
        }
      }catch(ArrayIndexOutOfBoundsException e) {
        System.out.println("ArrayIndexOutOfBounds" + e);
      }catch(ArithmeticException e) {
        System.out.println("Divide by 0: " + e);
      }
    }
  }

/*OUTPUT
  Divide by 0: java.lang.ArithmeticException: / by zero  */

