package Day03;

public class RotatedByOne {
    public static void rotatedByOne(int arr[]){
        int n = arr.length;
        int temp = arr[0];
        for(int i = 0;i<n-1;i++){
            arr[i] = arr[i+1];
        }
        arr[n-1]=temp;
        System.out.println("");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        // int left = arr[0];
        // int right = arr[arr.length-1];
        // for (int i =0;i<arr.length;i++){
        //     while(left>right){
        //         int temp = arr[left];
        //         arr[left]= arr[right];
        //         arr[right]= temp;
        //     }
        // }
        // for(int i =0;i<arr.length;i++){
        //     System.out.print(arr[i]+ " ");
        // }


    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        rotatedByOne(arr); 
    }
}
