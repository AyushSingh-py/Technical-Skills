import java.util.Scanner;
// Given an array of integers and a value k, 
// check whether there exists a pair of distinct elements whose sum is equal to k.
public class find_pair_equal_k_arr {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner (System.in);
        System.out.println("enter no.");
        num =sc.nextInt();
        System.out.println("enter k");
        int k =sc.nextInt();
        int[] arr = new int[num];

        for(int i=0;i<num;i++){
                arr[i] = sc.nextInt();
            
        }
        boolean found = false;
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                if(arr[i] + arr[j] == k && i != j){
                    found = true;
                    break;
                }
            }
            if(found){
                break;
            }
        }

        if(found){
            System.out.println("exist");
        } else {
            System.out.println("not exist");
        }
        sc.close();
    }
}

