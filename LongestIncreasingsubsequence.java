public class LongestIncreasingsubsequence {
      static int solve(int arr[] , int n, int curr, int pre ){

            if(curr == n){
                  return 0;
            }
            int include = 0;
            if(pre == -1 || arr[pre]<arr[curr]){
                  include=1+solve(arr, n, curr+1, curr);
            }
            int exclude = solve(arr, n, curr+1, pre);
            return Math.max(include,exclude);
      }
      public static void main(String[] args) {
            
            // int arr[] = { 5, 8, 3, 7, 9, 1};
            // int arr[] = { 0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15};
            // int arr[] = {3, 10, 2, 1, 20};
            int arr[] = {3, 2};
            int n = arr.length;
            System.out.print(solve( arr, n, 0, -1 ));
      }
      
}
