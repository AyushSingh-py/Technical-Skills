// find second largest element in array.
import java.util.Scanner;
public class second_largest_element_arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter how many element to be inserted : ");
        int num = sc.nextInt();

        int[] arr = new int[num];

        System.out.print("Enter Elements : ");
        for(int i=0 ; i<num;i++){
            arr[i] = sc.nextInt();
        }

        int max =arr[0];
        for(int i=0;i<num;i++){
            if(arr[i] >max){
                max= arr[i];
            }
        }
        int sec_max =arr[0];
        for(int i=0;i<num;i++){
            if(arr[i] > sec_max && arr[i] < max){
                sec_max = arr[i];
            }
        }
        System.out.println(sec_max);
    }
}
