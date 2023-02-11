import java.util.*;
import java.util.Collections;
class Variations {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        Integer arr[] = new Integer[n];
        for(int i=0; i<n; i++)
        arr[i] = kb.nextInt();
        Arrays.sort(arr, Collections.reverseOrder());
        int var = 0;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(Math.abs(arr[i]-arr[j])>=k)
                break;
                var++;
            }
        }
        int pairs = (n*(n-1))/2;
        System.out.println(pairs-var);

    }
}
