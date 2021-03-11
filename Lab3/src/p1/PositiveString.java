package p1;

import java.util.*;

public class PositiveString {
	static boolean isAlphabaticOrder(String s)  
    {    
        int n = s.length();   
        char c[] = new char [n]; 
        for (int i = 0; i < n; i++) {  
            c[i] = s.charAt(i);  
        } 
        Arrays.sort(c);  
        for (int i = 0; i < n; i++)  
            if (c[i] != s.charAt(i))   
                return false;  
                
        return true;      
    }  
      
    public static void main(String args[]) 
    { 
    	System.out.println("Enter the string: ");
    	Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(); 
        if (isAlphabaticOrder(s))  
           System.out.println("True");  
        else
            System.out.println("False");  
            
    } 

}
