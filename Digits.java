import java.util.*;
 class Digits {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t>0){
		t--;
        String s = kb.next();
        char arr[] = s.toCharArray();
        Arrays.sort(arr);
        int zero = 0;
        int one = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]=='0')
            zero++;
            else
            one++;
        }
        if(zero == 1 || one == 1)
        System.out.println("YES");
        else
        System.out.println("NO");
    }
    }
}
