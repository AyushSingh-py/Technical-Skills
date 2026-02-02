//given an integer array of size n in one second u can increase the value of one element by 1. 
// find the minimum time in seconds to make all the element of the array equal.

// Observation - to minimize the time,make all element equal to the maximum element in the array.

// Pusedo Code - find the mx element in array.
//               for every element calculate how much it needs to be increased to reach the maximum 
//               sum of all the differences.that sum equals to your time.

public class all_element_equal {
    public static void main(String[] args) {
        int[] arr={1,4,5,2,6,7};
        int sum =0;
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            sum+= max-arr[i];
        }
        System.out.println(sum);
    }
}

