import java.util.HashMap;

import java.util.Arrays;
public class MakeUniqueArray {

      static int solve(int []arr){

            int cnt = 0 ;
            //sort array
            Arrays.sort(arr);
            for( int  i = 1 ;i<arr.length ; i++ ){

                  if(arr[i]<= arr[i-1]){
                        cnt += arr[i-1]+1 - arr[i];
                        arr[i] = arr[i-1]+1;
                  }
            }

            return cnt;
      }
      public static void main(String[] args) {
            
            int arr[] = {1 , 1, 2, 3};

            System.out.println(solve(arr));
      }
}
