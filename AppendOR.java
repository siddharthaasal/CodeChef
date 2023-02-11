import java.util.*;
class AppendOR {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-->0){
		int n = kb.nextInt();
        int y = kb.nextInt();
        int a = 0;
		int arr[] = new int[n];
		for(int i=0; i<n; i++){
            arr[i] = kb.nextInt();
            a = a|arr[i];
        }
        String str="";
        int flag = 0;
        String p = Integer.toBinaryString(a);
        String q = Integer.toBinaryString(y);
        int l1 = p.length();
        int l2 = q.length();
        if(l1-l2>0){
            System.out.println("-1");
        }
        else{
            if(l2-l1>0){
                for(int i=1; i<=l2-l1; i++){
                    p = "0"+p;
                }
            }
            //l2=l1

            int l = p.length();
            for(int i=0; i<l; i++){
                char c1 = p.charAt(i);
                char c2 = q.charAt(i);

                if(c1=='1'&& c2=='1'){
                    str = str + "0";
                }
                else if(c1=='0'&& c2=='0'){
                    str = str + "0";
                }
                else if(c1=='0'&& c2=='1'){
                    str = str + "1";
                }
                else{
                    flag = 1;
                    System.out.println("-1");
                    break;
                }
            }

            if(flag==0){
                int decimal=Integer.parseInt(str,2);
                System.out.println(decimal);
            }
        }
		
    }

    }
}