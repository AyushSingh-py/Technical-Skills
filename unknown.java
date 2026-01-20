// Q - given an array count number of elements having atleast one element greater than itself ?

// Observation - For every max element , their won't be any element greater than itself . 

// Puesdo Code - 
// 1. Iterate and find max element from array.
// 2. Iterate and get the no. of elements that are not equal to max.
// 3. Increment of counter.


class unknown {
    public static void main (String[] args){
        int[] arr = {1,4,2,6,3,7,7,7};
        int count = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if (arr[i]<arr[j]) {
                    count++ ;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}


// class unknown {
//     public static void main(String[] args) {
//         int[] arr = {1,2,3,3,5,7,4,6,7,5,6};
//         int counter =0 ;
//         int max = arr[0];

//         for (int i =0;i<arr.length;i++){
//             if (max < arr[i]) {
//                 max = arr[i];
               
//             }
//         }

//         for (int i=0 ;i<arr.length ;i++){
//             if (arr[i] != max) {
//                 counter++ ;
//             }
//         }
//         System.out.println(counter);

//     }
// }