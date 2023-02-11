
import java.util.*;
class SubtaskProblem {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-->0){
		int n = kb.nextInt();
        int m = kb.nextInt();
        int k = kb.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++)
		arr[i] = kb.nextInt();

        int count = 0, flag=0;
        int check = m;
        for(int i=0; i<n; i++){
            if(arr[i]==1){
                count++;
                check--;
            }
            else{
                if(check>0){
                    flag = 1;  //0 before req k cases
                }
                else{
                    break;
                }
            }
        }

        if(flag==1)
        System.out.println("0");
        else{
            if(count==n){
                System.out.println("100");
            }
            else{
                System.out.println(k);
            }
        }
        

    }
    }
}