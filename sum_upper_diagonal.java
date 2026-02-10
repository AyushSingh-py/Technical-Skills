// write a program for sum of upper diagonal element of matrix
import java.util.Scanner;
public class sum_upper_diagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter row");
        int row =sc.nextInt();
        System.out.println("Enter col");
        int col = sc.nextInt();
        int sum = 0 ;
        int[][] arr = new int[row][col];
        for(int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                arr[i][j] = sc.nextInt();
            }
            System.out.println(" ");
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i<j){
                    sum += arr[i][j];
                }
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
