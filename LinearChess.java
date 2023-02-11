import java.util.*;
class LinearChess {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-->0){
		int n = kb.nextInt();
        int k = kb.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++)
		arr[i] = kb.nextInt();

        int flag = 0, moves =Integer.MAX_VALUE, output = -1;

        for(int i=0; i<n; i++){
            if(k%arr[i]==0){
                int x = k/arr[i];
                if(x+1<moves){
                    moves = x+1;
                     output = arr[i]; 
                    flag++;
                }
            }
        }
        if(flag==0)
        System.out.println("-1");
        else
        System.out.println(output);
    }

    }
}
