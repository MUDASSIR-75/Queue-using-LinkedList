// Insertion sort Program
package insertion_sort;

public class Insertion_sort {
    
    // this function is for insertion sort
    public static void Insertion_Sort (int [] Array)
    {
        for (int i = 1; i < Array.length; i++) 
        { 
            int temp = Array[i]; 
            int x; 
  
            for (x = i; x > 0 && temp < Array[x - 1]; x--)
            { 
                Array[x] = Array[x - 1];
            } 
            
            Array[x] = temp;
            // This statment print the array
            Display(Array);
            
        }
    }
       
    public static void Display(int [] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }

    
    public static void main(String[] args) {
        int [] array = {5,17,8,9,3,6,1,13};
        // before sortin of array
        System.out.print("Before sorting  Array : ");        
        Display(array);
        System.out.println("");
        
        // Callin sort function
        Insertion_Sort(array);
        
        // Printing array after sorting
        System.out.println("");
        System.out.print("After sorting  Array : ");
        Display(array);
    }
    
}
