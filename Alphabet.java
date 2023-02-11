 
    import java.util.*;
    class Alphabet
    {
    	public static void main (String[] args) throws java.lang.Exception
    	{
    		// your code goes here
    		Scanner kb = new Scanner(System.in);
    		String s = kb.next();
    		int n = kb.nextInt();
    	    String arr[] = new String[n];
    	    for(int i=0; i<n; i++)
    	    arr[i]=kb.next();
    		for(int k=0; k<n; k++){
    			int flag = 0;
    			String z = arr[k];
    			int l = z.length();
    	    for(int i=0; i<l; i++){
    	        char ch  = z.charAt(i);
    	        String str = String.valueOf(ch);
    	        if(s.contains(str)){
    	            continue;
    	        }
    	        else{
    	            flag++;
    	            break;
    	        }
    	    }
    	    if(flag==0)
    	    System.out.println("Yes");
    	    else
    	    System.out.println("No");
    		}
    	    
    	}
    }
