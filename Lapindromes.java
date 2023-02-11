import java.util.*;
 class Lapindromes {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t>0){
		t--;
        String s = kb.next();
        int n = s.length();
        String x,y;
        if(n%2!=0){
             x = s.substring(0,n/2);
             y = s.substring(n/2 + 1);
        }
        else{
             x = s.substring(0,n/2);
             y = s.substring(n/2);
        }

        char ch1[] = x.toCharArray();
        Arrays.sort(ch1);
        char ch2[] = y.toCharArray();
        Arrays.sort(ch2);

        String s1 = String.copyValueOf(ch1);
        String s2 = String.copyValueOf(ch2);

        if(s1.compareTo(s2)!=0)
        System.out.println("NO");
        else
        System.out.println("YES");

  

    }
    }
}
