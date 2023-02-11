import java.util.*;
class JumpHills {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-->0){
		int n = kb.nextInt();
        int u = kb.nextInt();
        int d = kb.nextInt();
		int arr[] = new int[n+1];
		for(int i=1; i<=n; i++)
		arr[i] = kb.nextInt();
        
        int index = 1;
        int lifeline = 1;
        for(int i=1; i<n; i++){
            if(arr[i]==arr[i+1]){
                index++;
            }
            else if(arr[i]<arr[i+1]){
                if(arr[i+1]-arr[i]<=u){
                    index++;
                }
                else{
                    break;
                }
            }
            else{
                //lower hill
                if(arr[i]-arr[i+1]<=d){
                    index++;
                }
                else{
                    if(lifeline!=0){
                        index++;
                        lifeline--;
                    }
                    else{
                        break;
                    }
                }
            }
        }
        System.out.println(index);
    }

    }
}