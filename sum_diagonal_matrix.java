import java.util.Scanner;

public class sum_diagonal_matrix {
    public static void main(String[] args) {
        int row,col;
        Scanner sc = new Scanner (System.in);
        System.out.println("enter row");
        row =sc.nextInt();
        System.out.println("Enter col");
        col = sc.nextInt();
        int sum =0;
        int[][] arr = new int[row][col];

        for(int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                arr[i][j] = sc.nextInt();
            }
            System.out.println(" ");
        }

        
        for(int i=0;i<row;i++){
            for (int j=0;j<col;j++){
            if(i==j){
                sum+=arr[i][j];
            }
        }
        }

        System.out.println(sum);

        
        sc.close();
    }
}
