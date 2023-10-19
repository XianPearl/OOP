//WAP in Java to print "Welcome to java"

import java.util.*;
public class welcome {
  public static void main (String args[]) {
    System.out.println("Welcome to java");
  }
}

/*Output
  Welcome to java*/

//WAP to use 2 integers and print their sum, difference and product

import java.util.*;
public class calc {
  public static void main (String args[]) {
    int a=10, b=20;
    System.out.println ("Sum="+(a+b));
    System.out.println ("Difference="+(a-b));
    System.out.println ("Product="+(a*b));
  }
}

/*OUTPUT
  Sum = 30
  Difference = -10
  Product = 200  */

//Accept an integer and check whether it is prime or not

import java.util.*;
public class prime {
  public static void main (String args[]) {
    int x = Integer.parseInt(args[0]);
    int i;
    for(i = 2; i < x; i++) 
      if (x % i == 0) {
        System.out.println("Not prime");
        break;
      }
    if (x == i)
      System.out.println("Prime");
  }
}

/*OUTPUT
  java prime 21
  Not prime  */

//WAP to read 3 sides of a triangle and calculate the corresponding perimeter and area

import java.util.*;
public class triangle {
  public static void main (String args[]) {
    int a = Integer.parseInt (args[0]);
    int b = Integer.parseInt (args[1]);
    int c = Integer.parseInt (args[2]);
    int i = a+b+c;
    double s = i/2;
    System.out.println("Perimeter = " + i);
    System.out.println("Area = " + (Math.sqrt(s * (s - a) * (s - b) * (s - c))));
  }
}

/*OUTPUT
  java triangle 8 9 3
  Perimeter = 20
  Area = 11.832159566199232  */

/*   Accept a number n and a string s from the user and display the string n number of times. The number and the string should be taken as inputs through command
line arguments. */

import java.util.*;
public class repeat {
  public static void main (String args[]) {
    int x = Integer.parseInt (args[0]);
    String s = args[1];
    int i;
    for (i = 1; i <= x; i++)
      System.out.println(s);
  }
}

/*OUTPUT
  java repeat 3 Sam
  Sam
  Sam
  Sam */

//WAP that converts farenheit to celcius

import java.util.*;
public class temp {
  public static void main (String args[]) {
    Double F = Double.parseDouble(args[0]);
    System.out.println("Temperature in Celcius = " + ((F - 32)/1.8));
  }
}

/*OUTPUT
  java temp 98.6
  37.0 */

