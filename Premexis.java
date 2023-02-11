import java.util.*;
class Premexis {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-->0){
		int n = kb.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++)
		arr[i] = kb.nextInt();

        Arrays.sort(arr);
        int flag = 0;
        for(int i=0; i<n-1; i++){
            if(arr[i+1]-arr[i]>1){
                flag = 1;
                break;
            }
        }
        if(flag==0)
        System.out.println("YES");
        else
        System.out.println("NO");
    }

    }
}