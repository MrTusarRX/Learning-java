import java.util.Scanner;  /* for scan function */


public class ifcondition { /* class name  */
    public static void main(String[] args){ /* main function */
        int age; /* integer variable for age */
        Scanner me = new Scanner(System.in); /* create scanner object */
        System.out.println("Enter Your Age : "); /* prompt for age */
        age = me.nextInt();
        me.nextLine(); /* consume the newline character after nextInt() */
        System.out.println("Do you Have Id : yes or no type"); /* prompt for id */
        String id = me.nextLine(); /* read id input */
        vote(age, id); /* call vote function with age and id */
       me.close(); /* close the scanner */
    
   
}
  static void vote(int iage, String id){
         if(iage >= 18 || id.equals("yes")){ /* can be use also this function -> id == "yes" its kinda same as id.equals("yes") you can use it if you use different variable name*/ 
            System.out.println("you are eligable to vote");
        }else{
            System.out.println("you are not eligable to vote bcz you are : " + iage + "years old");
        }
    }
}
