// write a program for sum of lower diagonal element of matrix
import java.util.Scanner;
public class sum_lower_diagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter row");
        int row =sc.nextInt();
        System.out.println("Enter col");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        for(int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                arr[i][j] = sc.nextInt();
            }
            System.out.println(" ");
        }
        int sum_lower=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i>j){
                    sum_lower +=arr[i][j];
                }
            }
        }

        System.out.println(sum_lower);
    }
}
