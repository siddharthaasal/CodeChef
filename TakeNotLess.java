import java.util.*;
class TakeNotLess {
    static int c = 1;
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-->0){
		int n = kb.nextInt();
		long arr[] = new long[n];
		for(int i=0; i<n; i++)
		arr[i] = kb.nextLong();

        if(n==1){
            System.out.println("Marichka");
        }
        else{
            Arrays.sort(arr);
            int x  = fn(arr, n-1);
            if(x%2==0)
            System.out.println("Zenyk");
            else
            System.out.println("Marichka");
        }

        

        }
    }
    public static int fn(long arr[], int idx){
        if(idx==0){
            return c;
        }
        else if(arr[idx]!=arr[idx-1]){
            return c;
        }
        else{
            c++;
            fn(arr, idx-1);
        }
        return c;
    }
}