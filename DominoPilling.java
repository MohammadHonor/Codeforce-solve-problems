import java.util.Scanner;

public class DominoPilling {

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int m = sc.nextInt();
                int n = sc.nextInt();
                System.out.println((int)(Math.floor((m*n)/2)));
                sc.close();
        }
        
}
