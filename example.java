// given an array element check if there exists a pair [i,j] such that arr[i]+arr[j]=k and i!=j.
// i and j are index value and k is the given sum.
public class example {
    public static void main(String[] args) {
        int[] arr={2,4,5};
        int product =1;
        int[] total = new int[arr.length];
        for(int i=0;i<arr.length-1;i++){
            product*=arr[i];
        }
        for(int i=0;i<arr.length;i++){
            total[i]=product/arr[i];
        }
    }
}
