/* Create 2 packages having the names, admission, and education. The admission package will contain classes student_details and library. The student details
   should contain student name, department and date of borth, which should be displayed and should be inputed through the keyword. The library class should 
   contain the book details namely, namely book_name, issue_date, return_date which should be inputed through the keyboard and be displayed accordingly.
   The education package should contain 2 classes assignment and examination. The assignment class will be having assignment_no, assignment_subject, 
   mark_on_assignment. The values should be user input and be displayed. The examination class should contain members, subject and marks which will
   also be user input and be displayed. The display should be menu driven in the main class.   */

//Package/admission/Library.java
package Package.admission;
import java.util.Scanner;
class library {
   private String book_name, issue_date, return_date;
   public void input() {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter book name: ");
      book_name = in.nextLine();
      System.out.println("Enter issue date: ");
      issue_date = in.nextLine();
      System.out.println("Enter return date: ");
      return_date = in.nextLine();
   }
   public void display() {
      System.out.println("Book Name: " + book_name);
      System.out.println("Issue Date: " + issue_date);
      System.out.println("Return Date: " + return_date);
   }
}

//studentDetails.java
package Package.admission;
import java.util.Scanner;
public class studentDetails {
   private String student_name, department, date_of_birth;
   public void display() {
      System.out.println("Name: " + student_name);
      System.out.println("Department: " + department);
      System.out.println("Date of birth: " + date_of_birth);
   }
   public void input() {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter name: ");
      student_name = in.nextLine();
      System.out.println("Enter department: ");
      department = in.nextLine();
      System.out.println("Enter date of birth: ");
      date_of_birth = in.nextLine();
   }
}

//Package/education/Examination.java
package Package.education;
import java.util.Scanner;
public class Examination {
   private String subject;
   private double marks;
   public void input() {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter subject: ");
      subject = in.nextLine();
      System.out.println("Enter marks: ");
      marks = in.nextDouble();
   }
   public void display() {
      System.out.println("Subject: " + subject);
      System.out.println("Marks: " + marks);
   }
}

//assignment.java
package Package.education;
import java.util.Scanner;
public class assignment {
   private int ass_no;
   private double marks;
   private String subject;
   public void input() {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter subject: ");
      subject = in.nextLine();
      System.out.println("Enter assignment no.: ");
      ass_no = in.nextInt();
      System.out.println("Enter marks: ");
      marks = in.nextDouble();
   }
   public void display() {
      System.out.println("Subject: " + subject);
      System.out.println("Assignment Code: " + ass_no);
      System.out.println("Marks: " + marks);
   }
}

//educationManagement.java
import Package.admission.studentDetails;
import Package.admission.library;
import Package.education.assignment;
import Package.education.examination;
import java.util.Scanner;
public class educationManagement {
   public static void main(String args[]) {
      Scanner in = new Scanner(System.in);
      while(true) {
         System.out.println("OPTIONS:\n1. Student\n2. Library\n3. Assignment\n4. Examination\n5. EXIT");
         System.out.println("Enter choice: ");
         int choice = in.nextInt();
         switch(choice) {
            case 1:
               studentDetails o = new studentDetails();
               o.input();
               o.display();
               break;
            case 2:
               library l = new library();
               l.input();
               l.display();
               break;
            case 3:
               assignment a = new assignment();
               a.input();
               a.display();
               break;
            case 4:
               examination e = new examination();
               e.input();
               e.display();
               break;
            case 5:
               System.out.println("Exiting the program");
               System.exit(0);
            default:
               System.out.println("Invalid choice");
         }
      }
   }
}

/*OUTPUT
   1. Student
   2. Library
   3. Assignment
   4. Examination
   5. Exit
   Enter choice:
   1
   Enter name:
   Subhojit Ghosh
   Enter department:
   CSE
   Enter date of birth:
   13/06/2003
   Name: Subhojit Ghosh
   Department: CSE
   Date of birth: 13/06/2003
   OPTIONS:
   1. Student
   2. Library
   3. Assignment
   4. Examination
   5. Exit
   Enter choice:
   5
   Exiting the program   */
