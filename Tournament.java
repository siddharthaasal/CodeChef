import java.util.*;
class Tournament
 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++)
        arr[i] = kb.nextInt();
        int var = 0;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                var+=Math.abs(arr[i]-arr[j]);
                
            }
        }
        System.out.println(var);

    }
}
