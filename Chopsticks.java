import java.util.*;
class Chopsticks {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
        long d = kb.nextLong();
		long arr[] = new long[n];
		for(int i=0; i<n; i++)
		arr[i] = kb.nextLong();

        Arrays.sort(arr);
        int pairs = 0;
        for(int i=0; i<n; ){
            if(i<n-1){
                if(arr[i+1]-arr[i]<=d){
                    i+=2;
                    pairs++;
                }
                else{
                    i++;
                }
            }
            else{
                break;
            }
        }
        System.out.println(pairs);
    }

    }
