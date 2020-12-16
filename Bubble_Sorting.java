// Bubble Sort Program

package bubble_sorting;

public class Bubble_Sorting {
    
    // This function is Bubble Sort  
    public static void Bubble_Sorting (int [] Array)
    {
        int x;
        for (int i = 0; i < Array.length -2; i++)
        {
            System.out.println("Pass : " +(i+1));
            
            for (int j = 0; j < Array.length - 1; j++)
            {
                if (Array[j] > Array[j + 1]) 
                { 
                    x = Array[j];
                    Array[j] = Array[j + 1];
                    Array[j + 1] = x;
                    // This statment print the array
                    Display(Array);
                } 
            }
            System.out.println("");
        }     
    }
    // this is display function
    public static void Display(int [] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [] array = {5,17,8,9,3,6,1,13};
        
        // before sortin of array
        System.out.print("Before Sorting Array : ");
        Display(array);
        System.out.println("");
        
        // Calling sort function
        Bubble_Sorting(array);
        // Printing array after sorting
        
        System.out.print("After Sorting Array : ");
        Display(array);
    }
    
}
