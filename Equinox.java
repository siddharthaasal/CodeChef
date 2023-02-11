import java.util.*;
 class Equinox {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t>0){
		t--;
        int n = kb.nextInt();
        long a = kb.nextInt();
        long b = kb.nextInt();
        String arr[] = new String[n];
        for(int i=0; i<n; i++)
        arr[i] = kb.next();

        long x = 0;
        long y = 0;
        String str = "EQUINOX";

        for(int i=0; i<n; i++){
            char ch = arr[i].charAt(0);
            String c = String.valueOf(ch);

            if(str.contains(c))
            x+=a;
            else
            y+=b;
        }

        if(x>y)
        System.out.println("SARTHAK");
        else if(y>x)
        System.out.println("ANURADHA");
        else
        System.out.println("DRAW");
    }
    }
}
