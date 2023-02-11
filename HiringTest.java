/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class HiringTest
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t>0){
		t--;
		int n  = kb.nextInt();
		int m = kb.nextInt();
		int x = kb.nextInt();
		int y = kb.nextInt();
		int result[] = new int[n];
		for(int z=0; z<n; z++){

            String str = kb.next();
		    char arr[] = str.toCharArray();
		    
		    
		    int a = freq('F', arr);
		    int b = freq('P', arr);
		    int c = freq('U', arr);
		    
		    if(a>=x){
		        result[z] = 1;
		    }
		    else if(a==x-1 && b>=y){
		        result[z] = 1;
		    }
		    else{
		        result[z] = 0;
		    }
		}
		
		for(int i=0; i<n; i++)
		System.out.print(result[i]);
		
		System.out.println();
    }
	}

    public static int freq(char ch, char arr[]){
        int c = 0;
        for(int i =0; i<arr.length; i++){
            if(arr[i]==ch)
            c++;
        }
        return c;
    }
}
