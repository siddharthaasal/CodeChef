
import java.util.*;
class MISSP {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-->0){
		int n = kb.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++)
		arr[i] = kb.nextInt();
        for(int i=0; i<n; i++){
            int x = freq(arr[i], arr);
            if(x!=2){
                System.out.println(x);
                break;
            
        }
    }
    


    }
}
    public static int freq(int k, int arr[]){
        int c = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==k)
            c++;
        }
        return c;
    }
}