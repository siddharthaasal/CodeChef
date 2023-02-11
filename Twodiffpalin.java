import java.util.*;
class Twodiffpalin {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-->0){
		int a = kb.nextInt();
        int b = kb.nextInt();
        if(a%2!=0 && b%2!=0){
            System.out.println("No");
        }
        else if(a%2==0 && b%2==0){
            System.out.println("Yes");
        }
        else{
            if(a==1 || b==1){
                System.out.println("No");
            }
            else{
                System.out.println("Yes");
            }
        }
		
    }

    }
}