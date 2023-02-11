import java.util.*;
class VideoGame
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int h = kb.nextInt();
		int arr[] = new int[n];
        for(int i=0; i<n; i++)
        arr[i] = kb.nextInt();
        ArrayList<Integer> com = new ArrayList<Integer>();
        boolean flag = true;
        while(flag){
            int num = kb.nextInt();
            if(num==0)
            flag = false;
            com.add(num);
        }
        boolean crane = false;
        int pos = 0;
        flag = true;
        int x = -1;
        while(flag){
            x++;
            switch(com.get(x)){

                case 1:
                pos = left(arr, n, h, pos, crane);
                break;

                case 2:
                pos = right(arr, n, h, pos, crane);
                break;

                case 3:
                crane = pick(arr, n, h, pos, crane);
                break;

                case 4:
                crane = drop(arr, n, h, pos, crane);
                break;

                case 0:
                flag = false;
            }
        }
        for(int i =0; i<n; i++)
        System.out.print(arr[i]+ " ");

        
	}
    public static boolean pick(int arr[], int n, int h, int pos, boolean crane){
        if(arr[pos]!=0 && crane!=true){
            crane = true;
            arr[pos]--;
        }
        return crane;
    }
    public static boolean drop(int arr[], int n, int h, int pos, boolean crane){
        if(arr[pos]!=h && crane!=false){
            crane = false;
            arr[pos]++;
        }
        return crane;
    }
    public static int left(int arr[], int n, int h, int pos, boolean crane){
        if(pos!=0){
            pos--;
        }
        return pos;
    }
    public static int right(int arr[], int n, int h, int pos, boolean crane){
        if(pos!=n-1){
            pos++;
        }
        return pos;
    }
}
