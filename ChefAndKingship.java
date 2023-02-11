import java.util.*;
class ChefAndKingship {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-->0){
		int n = kb.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++)
		arr[i] = kb.nextInt();

        Arrays.sort(arr);
        int cost = 0;
        for(int i=1;i<n; i++){
            cost+=arr[0]*arr[i];
        }
        System.out.println(cost);
    }

    }
}