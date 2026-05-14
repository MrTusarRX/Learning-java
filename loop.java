public class loop { /* class name */
    public static void main(String[] args){ /* main function */
       char array[] =  {'a', 'b', 'c', 'd', 'e'}; /* character array */
        System.out.println("the array index is : "); /* print statement */
       for(int i = 0; i < array.length; i++){ /* for loop to iterate through the array */
        System.out.println(array[i]); /* print each element of the array */
       }
        looprev(); /* call the function to demonstrate reverse loop */
    }
   public static void looprev(){ /* function to demonstrate reverse loop */
        String name =  "rasut"; /* string variable */
        char[] arr = name.toCharArray();                         /* character array */
        System.out.println("the array index in reverse is : "); /* print statement */
       for(int i = arr.length - 1; i > 0; i--){ /* for loop to iterate through the array in reverse */
        System.out.println(arr[i] + ""); /* print each element of the array in reverse */
       }
    }
}
