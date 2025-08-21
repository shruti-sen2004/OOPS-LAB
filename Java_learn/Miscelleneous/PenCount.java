
import java.util.*;

class PenCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n]; 

        for (int i = 0; i<n ; i++){
            arr[i]= sc.nextInt();
        }

        String pen = "green";
        int count = 0;
        for (int i = 0; i<n; i++){
            if (arr[i] % 2 == 0){
                if (pen.equals("green")){
                    count++;
                    pen = "red";
                }
            }
            else{
                    if (pen.equals("red")){
                    pen = "green";
                }
            }
        }
        System.out.print(count);
    }
    sc.close();
}

