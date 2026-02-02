// given an array of integers, find the equilibrium index of the array.

class equilibrium{
    public static void main(String[] args) {
        int[] arr = {-3,2,4,-1};
        int counter =0;
        
        int n= arr.length;
        int[] prefix_sum = new int [arr.length];
        
        prefix_sum[0]=arr[0];
        
        int[] leftSum_arr = new int [arr.length];
        int[] rightSum_arr = new int [arr.length];


        for(int i=1;i<n;i++){
            prefix_sum[i]=arr[i]+prefix_sum[i-1];

        }

        for(int i=0;i<n;i++){

            if(i==0){
                leftSum_arr[i]=0;
            }else{
                leftSum_arr[i]=prefix_sum[i-1];
            }

            rightSum_arr[i]=prefix_sum[n-1]-prefix_sum[i];

            
        }

        for(int i=0;i<arr.length;i++){
            if(leftSum_arr[i]==rightSum_arr[i]){
                System.out.println("Equilibrium index is : "+ i);
                counter++;
            }
        }

        System.out.println(counter);

    }
}


