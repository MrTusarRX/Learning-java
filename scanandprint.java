import java.util.Scanner; /* for scan function */

public class scanandprint { /* class name  */
public static void main(String[] args){ /* main function */

    Scanner test = new Scanner(System.in); /* create scanner object */
    
    System.out.println("Enter Your Name : ");  /* prompt for name */

     String name1 = test.nextLine(); /* read name input */
    
    Scanner test2 = new Scanner(System.in); /* create second scanner object */
    
    System.out.println("Enter Your father name : "); /* prompt for father's name */

    



    System.out.println("your  name is  : " + name1 + " and your father's name is : " + test2.nextLine()); /* print name and father's name */




}


}