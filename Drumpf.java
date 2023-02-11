import java.util.*;
class Drumpf {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-->0){
		int n = kb.nextInt();
        int k = kb.nextInt();
		int arr[] = new int[n+1];
		for(int i=0; i<n; i++)
		arr[i] = kb.nextInt();
        
        int votes[] = new int[n+1];
        int size = 0;
        for(int i=0; i<n; i++){
            if(i+1!=arr[i]){
                votes[arr[i]]++;
            }
        }
        for(int i=0; i<=n; i++){
            if(i+1==arr[i])
            votes[i+1] = 0;
            if(votes[i]>=k)
            size++;
        }
        System.out.println(size);
    }

    }
}