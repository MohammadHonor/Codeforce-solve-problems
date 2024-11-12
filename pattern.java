import java.util.Scanner;

public class pattern {
      static void solve(int n ){

            for( int i = 0; i<n*2 ; i++ ){

                  if(i<n){
                        for(int j = 0 ;j<=i ;j++){
                              System.out.print("*"+" ");
                        }
                  }
                  else{
                        for(int k = i-n ; k<n-1 ;k++){
                              System.out.print("*"+" ");
                        }
                  }
                  System.out.println();
            }
      }
      public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();

            solve(n);

            sc.close();
      }
      
}
