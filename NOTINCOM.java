import java.util.*;
class NOTINCOM {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-->0){
		int n = kb.nextInt();
        int m = kb.nextInt();
		int arr1[] = new int[n];
        int arr2[] = new int[m];
        int freq[] = new int[1001];
        int c = 0;
		for(int i=0; i<n; i++){
            arr1[i] = kb.nextInt();
            freq[arr1[i]]++;
        }
        for(int i=0; i<m; i++){
            arr2[i] = kb.nextInt();
            if(freq[arr2[i]]>0){
                c++;
            }
        }
        System.out.println(c);
		
    }

    }
}