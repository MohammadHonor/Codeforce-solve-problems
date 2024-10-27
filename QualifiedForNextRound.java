import java.util.Scanner;
public class QualifiedForNextRound {

        static int qualifiedParticipants(int n , int participants[] , int k) {
               
                int count = 0;

                if(k==0){
                         for(int i = 0; i< n ;i++){

                        if(participants[i] > k){
                                count++;
                        }
                }
                }
                else{
                for(int i = 0; i< n ;i++){

                        if(participants[i] >= k){
                                count++;
                        }
                }
                }
                return count ;
        }
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                int n = sc.nextInt();
                int k = sc.nextInt();

                int participants[] = new int[n] ;

                for( int i = 0; i< n ;i++){

                        participants[i] = sc.nextInt();
                }

                System.out.println(qualifiedParticipants(n , participants , participants[k-1]));
                sc.close();

        }
}
