public class sortarray {
    public static void main(String[] args){
        int array[] = {5, 2, 8, 1, 3}; /* integer array */
        System.out.print("the array before sorting is : "); /* print statement */
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " "); /* print each element of the array */
        }
        for(int i = 0; i < array.length - 1; i++){
            for(int j = 0; j < array.length - 1 -i; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp; /* swap elements if they are in the wrong order */
                }
            }
        }
        System.out.println("\nthe array after sorting is : "); /* print statement */
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " "); /* print each element of the sorted array */
        }
    }

}
