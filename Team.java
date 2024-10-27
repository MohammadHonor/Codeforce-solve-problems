import java.util.Scanner;

public class Team {

    static int solve(int arr[]){

        int temp =0;

        for(int i = 0; i<arr.length ;i++){

            if(arr[i] == 1 ){
                temp++;

            }
        }

        if(temp >=2){
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        int n = sc.nextInt();

        int count = 0;
        int arr[] = new int[3];

        for( int i = 0; i<n ;i++ ){

           arr[0] = sc.nextInt();
           arr[1] = sc.nextInt();
           arr[2] = sc.nextInt();

           count += solve(arr);

        }
        System.out.println(count);
        sc.close();
    }
    
}
