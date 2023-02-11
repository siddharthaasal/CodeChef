/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class cc
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		long arr[] = new long[n];
		for(int i =0; i<n; i++)
		arr[i] = kb.nextInt();
		long out = profit(arr);
		System.out.println(out);
		
	}
	public static long profit(long arr[]){
	    int n =  arr.length;
	    Arrays.sort(arr);
	    long max = 0;
	    long p[] = new long[n];
	    for(int i =0; i<n; i++){
	        p[i] = arr[i]*(n-i);
	        if(max<p[i])
	        max = p[i];
	    }
	    return max;
	}
}
