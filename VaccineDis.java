import java.util.*;
class VaccineDis {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        while(t-->0){
		int n = kb.nextInt();
        int d = kb.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++)
		arr[i] = kb.nextInt();

        int risk = 0;
        for(int i=0; i<n; i++){
            if(arr[i]>=80 || arr[i]<=9){
                risk++;
            }
        }
        int notRisk = n - risk;
        int days = 0;
        days = days + risk/d;
        if(risk%d!=0){
            days++;
        }
        days = days + notRisk/d;
        if(notRisk%d!=0){
            days++;
        }

        System.out.println(days);
    }

    }
}