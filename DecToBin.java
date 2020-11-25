package dec.to.bin;

import java.util.Scanner;

public class Dec_To_Bin {
    
    static void rec(int num) { 
        
        if (num == 0)  
            return;
        
        else       
            rec(num / 2); 
            System.out.print (num % 2);
    } 
      
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter Decimal Number : ");
    	int n = s.nextInt(); 

        rec(n);
    }   
}