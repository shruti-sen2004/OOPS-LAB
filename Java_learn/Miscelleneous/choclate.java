
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int child = sc.nextInt();
        
        int choclate = 0;
        for(int i = 1; i <= child ; i++){
            if (child % 5 == 0){
                if ((i-1) % 5 == 0){
                    choclate += i + 2;
                    System.out.println("child" + i + "->"+ choclate);
                }
                else if ((i +1) % 5 == 0){
                    choclate += i + 2;
                    System.out.println("child" + i + "->"+ choclate);
                }
                else {
                choclate += i ;
                System.out.println("child" + i + "->"+ choclate);
                }
            }
            else {
                if ((i-1) % 5 == 0 && i != 1){
                    choclate += i + 2;
                    System.out.println("child" + i + "->"+ choclate);
                }
                else if ((i +1) % 5 == 0 && child > 5){
                    choclate += i + 2;
                    System.out.println("child" + i + "->"+ choclate);
                }
                else {
                choclate += i ;
                System.out.println("child" + i + "->"+ choclate);
                }
            }
            sc.close();
        }
       
    } 
}