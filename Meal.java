
import java.util.*;
class LinearChess {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-->0){
		int n = kb.nextInt();
		String arr[] = new String[n];
        String str = "";
		for(int i=0; i<n; i++){
            arr[i] = kb.next();
            str = str+arr[i];
        }
		
        int l = str.length();
        int freq[] = new int[7];

        for(int i=0; i<l; i++){
            char ch = str.charAt(i);

            if(ch == 'c')
            freq[0]++;
            else if(ch == 'o')
            freq[1]++;
            else if(ch == 'd')
            freq[2]++;
            else if(ch == 'e')
            freq[3]++;
            else if(ch == 'h')
            freq[4]++;
            else if(ch == 'e')
            freq[5]++;
            else if(ch == 'f')
            freq[6]++;

        }

        int min = Integer.MAX_VALUE;
        for(int i=1; i<7; i++){
            if(freq[i]<min){
                min = freq[i];
            }
        }

        if(freq[0]>=2*min){
            System.out.println(min);
        }
        else{
            System.out.println("0");
        }
    }

    }
}