import java.util.*;
class SnakeProcession
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t>0){
		t--;
		int n = kb.nextInt();
		String s = kb.next();
		String str = "";
		for(int i=0; i<n; i++){
		    if(s.charAt(i)!='.'){
		        str+=s.charAt(i);
		    }
        }
        
        int l = str.length();
        if(str.charAt(0)=='T'){
            System.out.println("Invalid");
        }
        else if(str.charAt(l-1)=='H'){
            System.out.println("Invalid");
        }
        else{
            int flag = 0;
            for(int i=0; i<l-1; i++){
                if(str.charAt(i)==str.charAt(i+1)){
                    flag++;
                    break;
                }
            }
            if(flag==0)
            System.out.println("Valid");
            else
            System.out.println("Invalid");
        }
	}
}
}
