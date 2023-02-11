import java.util.*;
class CollegeLife2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-->0){
		int s = kb.nextInt();
		int intro[] = new int[s];
		for(int i=0; i<s; i++)
		intro[i] = kb.nextInt();

        int sum  = 0;
        
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<s; i++){
            int ep = kb.nextInt();
            arr.add(ep); //num of ep
            while(ep-- > 0 ){
                int z = kb.nextInt();
                arr.add(z);
                sum+=ep*z;
            }
            System.out.println(sum);
            //sum-=intro[i];
        }

        
        }
    }
}