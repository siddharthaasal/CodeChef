/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-->0){
		int x = kb.nextInt();
		int y = kb.nextInt();
		int z = kb.nextInt();
		
		if(x%3==0){
		    System.out.println((x/y)*z);
		}
		else{
		    System.out.println(((x/y)+ 1)*z);
		}
    }
	}
}
