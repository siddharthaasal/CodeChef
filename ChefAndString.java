import java.util.*;
 class ChefAndString {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t>0){
		t--;
        String s = kb.next();
        String l = s.substring(1) + s.substring(0,1);
        String r = s.substring(s.length()-1) + s.substring(0,s.length()-1);
        // System.out.println(l);
        // System.out.println(r);
         if(l.compareTo(r)==0)
        System.out.println("YES");
        else
        System.out.println("NO");
    }
    }
    
}
