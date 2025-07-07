package Day03;

public class RotatedArray {
     public static void rotatedArray(int[] arr){
        int left =0;
        int right = arr.length-1;
        for(int i =0;i<arr.length;i++){
            while(left<right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        for(int j =0;j<arr.length;j++){
            System.out.print(arr[j]+ " ");
        }
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        rotatedArray(arr);
    }
}
