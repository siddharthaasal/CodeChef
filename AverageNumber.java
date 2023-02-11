 import java.util.*;
 class AverageNumber {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t>0){
		t--;
        int n = kb.nextInt();
        int k = kb.nextInt();
        int v = kb.nextInt();
        int arr[] = new int[n];
        int sum = 0;
        for(int i=0; i<n; i++){
            arr[i] = kb.nextInt();
            sum+=arr[i];
        }
        
        float x = ((v*(n+k)) - sum)/k;
        int y = ((v*(n+k)) - sum)/k;
        System.out.println(x);
        System.out.println(y);

    }
    }
}
