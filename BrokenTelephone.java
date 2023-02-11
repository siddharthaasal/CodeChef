import java.util.*;
class BrokenTelephone {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-->0){
		int n = kb.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++)
		arr[i] = kb.nextInt();

        int prr[] = new int[n];
        for(int i=0; i<n-1; i++){
            if(arr[i]!=arr[i+1]){
                prr[i]=1;
                prr[i+i]=1;
            }
        }
        int c = 0;
        for(int i=0; i<n; i++){
            if(prr[i]==1){
                c++;
            }
        }
        System.out.println(c);
    }

    }
}