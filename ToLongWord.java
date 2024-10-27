import java.util.Scanner;

public class ToLongWord {

    static String solve(String s) {
        if(s.length() > 10){
            char first = s.charAt(0);
            char last = s.charAt(s.length() - 1);
            String mid = Integer.toString(s.length() - 2);
            return first + "" + mid + "" + last;
        }
       return s;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String arr[] = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        for (int i = 0; i < n; i++) {
            System.out.println(solve(arr[i]));
        }

        sc.close();

    }
}