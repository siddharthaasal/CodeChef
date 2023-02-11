import java.util.*;
class VSTOCK{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-->0){
		double s = kb.nextDouble();
        double a = kb.nextDouble();
        double b = kb.nextDouble();
        double c = kb.nextDouble();

        double price = 0;
        if(c>=0){
             price = s + (c/100 * s);
        }
        else{
             price = s - ((-1*c)/100 * s);
        }

        if(price>=a && price<=b){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        // System.out.println(price);
		
        }
    }
}