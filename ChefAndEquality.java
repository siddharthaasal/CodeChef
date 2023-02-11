import java.util.*;
class ChefAndEquality {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-->0){
		int n = kb.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++)
		arr[i] = kb.nextInt();

        Arrays.sort(arr);
		    
        int c=1;
        int max=1;
        
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]==arr[i+1])
             c++;
             else
             c=1;
             
             max=Math.max(max,c);
        }
        System.out.println(n - max);
        
    }

    }
    // public static int freq(int k, int arr[]){
    //     int c = 0;
    //     for(int i=0; i<arr.length; i++){
    //         if(arr[i]==k){
    //             c++;
    //         }
    //     }

    //     return c;  
    // }
    
}