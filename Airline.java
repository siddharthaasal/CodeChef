import java.util.*;
public class Airline {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-->0){
		int a = kb.nextInt();
        int b = kb.nextInt();
        int c = kb.nextInt();
        int d = kb.nextInt();
        int e = kb.nextInt();

        int flag  = 0;
        if(a+b<=d && c<=e)
        flag = 1;
        else if(b+c<=d && a<=e)
        flag = 1;
        else if(c+a<=d && b<=e)
        flag = 1;
        else
        flag = 0;

        if(flag==1)
        System.out.println("YES");
        else
        System.out.println("NO");
    }
    
}
}
