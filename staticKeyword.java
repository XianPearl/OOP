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
  
