import java.util.*;
class Covid19{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-->0){
		int n = kb.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++)
		arr[i] = kb.nextInt();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            int x = spread(i, arr);
            if(x<min){
                min = x;
            }
            if(x>max){
                max = x;
            }
        }

        System.out.println(min+" "+max);
    }
    }

    public static int spread(int idx, int arr[]){
        int n = arr.length;
        int left, right;
        int c = 1;
        left = right = idx;
        while(left>0){
            if(arr[left]-arr[left-1]<=2){
                c++;
                left--;
            }
            else{
                break;
            }
        }
        while(right<n-1){
            if(arr[right+1]-arr[right]<=2){
                c++;
                right++;
            }
            else{
                break;
            }
        }

        return c;
    }
}