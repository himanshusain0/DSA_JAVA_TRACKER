public record Sort012() {
    public static void sort012(int[] arr){
        int low = 0, high = arr.length-1 ;
        int i = 0;
            while(i<=high){
                if(arr[i] ==0 ){
                    int temp = arr[low];
                    arr[low] =arr[i];
                    arr[i] = temp;
                    low++;
                    i++;
                }
                else if(arr[i] ==2){
                    int temp =arr[i];
                    arr[i] = arr[high];
                    arr[high] = temp;
                    high--;
                }
                else{
                    i++;
                }
            
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,0,2,0,1};
        sort012(arr);
        for(int i : arr){
            System.out.print(i + " " );
        }
    }
}
