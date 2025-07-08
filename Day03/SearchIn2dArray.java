class SearchIn2dArray{
    public static boolean search(int[][] arr, int target){
        int n = arr.length;
        int m = arr[0].length;
        int low=0,high = n*m-1;
        while(low<=high){
            int mid = (low+high)/2;
            int row = mid/m;
            int col = mid%m;
            if(arr[row][col]==target){
                return true;
            }
            else if(arr[row][col]<target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return false;


    }
    public static void main(String[] args) {
        int[][] arr ={
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
        int target = 7;
        boolean result = search(arr, target);
        System.out.println("Element found: " + result);
    }
}