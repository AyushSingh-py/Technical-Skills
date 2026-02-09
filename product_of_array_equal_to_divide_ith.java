//given an array of integer a find and return the product array of the same size where 
// the i th element of the product array will be equal to the product of 
// all elements divided by the i th element of the array.

public class product_of_array_equal_to_divide_ith {
    public static void main(String[] args) {
        int[] arr={2,4,5};
        int product =1;
        int[] total = new int[arr.length];
        for(int i=0;i<arr.length-1;i++){
            product+=arr[i]*arr[i+1];
        }
        for(int i=0;i<arr.length;i++){
            total[i]=product/arr[i];
        }
    }
}
