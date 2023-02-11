import java.util.*;
 class SUPW {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++)
        arr[i] = kb.nextInt();

        int time,index;
        if(n%3==0){
            time = 0;
            index = n;
        }
        else if(n%3==1){
            time = arr[n-1];
            index = n-1;
        }
        else{
            time = Math.min(arr[n-2], arr[n-1]);
            index = n-2;
        }

        for(int i =0; i<index; i+=3){
            time+=min(arr[i],arr[i+1],arr[i+2]);
        }
        System.out.println(time);


    }

    public static int min(int a, int b, int c){
        int smallest;
        if (a <= b && a <= c) {
            smallest = a;
        } 
        else if (b <= c && b <= a) {
         smallest = b;
        }
        else {
         smallest = c;
        }
        return smallest;
    }

}
