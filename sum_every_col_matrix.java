// wrirte a program to sum every column of matrix

import java.util.Scanner;

public class sum_every_col_matrix {
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

        for(int j=0;j<col;j++){
            int sum= 0;
            for(int i=0;i<row;i++){
                sum += arr[i][j];
                
            }
            System.out.println("Sum of column " +j+ " is: " +sum);
        }

    }
}
