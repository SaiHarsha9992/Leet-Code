//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = sc.next ();
    		int[] res = new Sol().count (s);
    		
    		for (int i = 0; i < 4; i++)
    		    System.out.println (res[i]);
        }
        
    }
}
// Contributed By: Pranay Bansal

// } Driver Code Ends


//User function Template for Java

class Sol
{
    int[] count (String s)
    {
        // your code here 
        int [] v = {0,0,0,0};
        for (int i = 0; i < s.length(); i++) {
			if (Character.isUpperCase(s.charAt(i))) {
				v[0]++;
			}
			if (Character.isLowerCase(s.charAt(i))) {
				v[1]++;
			}
			if (Character.isDigit(s.charAt(i))) {
				v[2]++;
			}
			if (!Character.isDigit(s.charAt(i)) && !Character.isLetter(s.charAt(i))
					&& !Character.isWhitespace(s.charAt(i))) {
				v[3]++;
			}
		} 
		return v;
    }
}