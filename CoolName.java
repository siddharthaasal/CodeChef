import java.util.Arrays;
import java.util.Scanner;
 class CoolName {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t>0){
		t--;
        String s = kb.next();
        char arr[] = s.toCharArray();
        Arrays.sort(arr);
        int pow = 0;
        for(int i = 0; i<arr.length; i++){
            pow = pow + (i+1)*eq(arr[i]);
        }
        System.out.println(pow);
    }
    }
    public static int eq(char ch){
        int n = 1;
        for(char c = 'a'; c<='z'; c++){
            if(c!=ch){
                n++;
            }
            else{
                break;
            }
        }
        return n;
    }
}
