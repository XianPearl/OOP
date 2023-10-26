/* Create a class 'Room' with data members length, breadth, height, and methods -
   Calc_area() - To calculate area of the room and display it.
   Derive 2 classes from this class namely bedroom and drawing room where bedroom will have attached bathroom, 
   study table and night lamp and a display method to display these features. Finally display the areas of both  
   bedroom and dining room.  */

class Room {
  double length, breadth, height;
  Room(double l, double b, double h) {
    length = l;
    breadth = b;
    height = h;
  }
  double calc_areq() {
    return length*breadth;
  }
}
class Bedroom extends Room {
  boolean nightLamp;
  Bedroom(double l, double b, double h, boolean n) {
    super(l, b, h);
    nightLamp = n;
  }
  void display() {
    System.out.println("The dimensions of the bedroom are: ");
    System.out.println("Length: " + length + "meters");
    System.out.println("Breadth: " + breadth + "meters");
    System.out.println("Height: " + height + "meters");
    System.out.println("The area of the bedroom is: " + calc_area() + "squaremeters");
    if (nightLamp)
      System.out.println("The bedroom has a night lamp");
    else
      System.out.println("The bedroom does not have a night lamp");
  }
}
class DrawingRoom extends Room {
  int sofa, wallCabinet;
  DrawingRoom(double l, double b, double h, int s, int w) {
    super(l, b, h);
    sofa = s;
    wallCabinet = w;
  }
    void display() {
    System.out.println("The dimensions of the drawing room are: ");
    System.out.println("Length: " + length + "meters");
    System.out.println("Breadth: " + breadth + "meters");
    System.out.println("Height: " + height + "meters");
    System.out.println("The area of the drawing room is: " + calc_area() + "squaremeters");
    System.out.println("The drawing room has " + sofa + " sofa(s) " + wallCabinet + " wall cabinet(s)");
  }
}
class Main {
  public static void main(String args[]) {
    Bedroom b = new Bedroom(5, 4, 3, true);
    DrawingRoom d = new DrawingRoom(6, 5, 4, 2, 1);
    b.display();
    d.display();
  }
}

/*OUTPUT
  The dimensions of the bedroom are: 
  Length: 5.0 meters
  Breadth: 4.0 meters
  Height: 3.0 meters
  The area of the bedroom is: 20.0 square meters
  The bedroom has a night lamp
  The dimensions of the drawing room are:
  Length: 6.0 meters
  Breadth: 5.0 meters
  Height: 4.0 meters
  The area of the drawing room is: 30.0 square meters
  The drawing room has 2 sofa(s) and 1 wall cabinet(s)   */

/* Create a class 'Account' with data members acc_no, acc_bal, and methods to deposit and withdraw money and display balance.
  Derive 2 subclasses - savings account and current account where savings account should maintain a minimum account balance
  of 1000 and current account should have overdraft facility.
  In addition to this, the savings account should have data member interest and a method to calculate interest and add to the
  account balance. For current account, there should be an overdraft limit. Use partinent methods to display all this information.  */

class Account {
  int acc_no;
  double acc_balance;
  void deposit(double amount) {
    acc_balance += amount;
  }
  void withdraw(double amount) {
    if (acc_balance >= amount)
      acc_balance -= amount;
    else
      System.out.println("Insufficient balance");
  }
  void display() {
    System.out.println("Account Number: " + acc_no);
    System.out.println("Account Balance: " + acc_balance);
  }
}
class SavingsAccount extends Account {
  double min_balance = 1000;
  void calculate_interest() {
    double interest = (acc_balance * 0.05) / 12;
    acc_balance += interest;
  }
}
class CurrentAccount extends Account {
  double overdraft_limit = 5000;
  void withdraw(double amount) {
    if (acc_balance + overdraft_limit >= amount)
      acc_balance -= amount;
    else
      System.out.println("Overdraft limit exceeded");
  }
  void display() {
    super.display();
    System.out.println("Overdraft limit: " + overdraft_limit);
  }
}
class Main {
  public static void main(String args[]) {
    SavingsAccount savings_account = new SavingsAccount();
    savings_account.acc_no = 12345;
    savings_account.acc_balance = 2000;
    savings_account.display();
    savings_account.calculate_interest();
    savings_account.display();
    CurrentAccount current_account = new CurrentAccount();
    current_account.acc_no = 67890;
    current_account.acc_balance = 5000;
    current_account.display();
    current_account.withdraw(6000);
    current_account.display();
  }
}

/*OUTPUT
  Account Number: 12345
  Account Balance: 2000.0
  Account Number: 12345
  Account Balance: 2008.3333333333
  Account Number: 67890
  Account Balance: 5000.0
  Overdraft limit: 5000.0
  Account Number: 67890
  Account Balance: -1000.0
  Overdraft limit: 5000.0   */
