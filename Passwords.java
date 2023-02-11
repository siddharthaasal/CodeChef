import java.util.*;
 class Passwords {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t>0){
		t--;
        String s = kb.next();
        int n = s.length();
        if(n<10){
            System.out.println("NO");
        }
        else{
            int u=0, l=0, d=0, c=0;
            for(int i=1; i<n-1; i++){

                if(Character.isUpperCase(s.charAt(i))){
                    u++;
                }
            
                else if(Character.isLowerCase(s.charAt(i))){
                    l++;
                }

                else if(Character.isDigit(s.charAt(i))){
                    d++;
                }
                else{
                    c++;
                }

            }

            if(u==0 || d==0 || c==0){
                System.out.println("NO");
            }

            else{

                if(Character.isLowerCase(s.charAt(0))){
                    l++;
                }
                if(Character.isLowerCase(s.charAt(n-1))){
                    l++;
                }

                if(l==0){
                    System.out.println("NO");
                }
                else{
                    System.out.println("YES");
                }

            }

        }

    }
    }
}
