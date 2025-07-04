public class MaxiSumOfSubArray {
    public static int maxSubArraySum(int[] arr){
        int maxi = Integer.MIN_VALUE;
        int n = arr.length;
        // for(int i =0;i<n;i++){
        //     for(int j =i ;j<n;j++){
        //         int sum =0;
        //         for(int k = i ;k<j;k++){
        //             sum += arr[k];
        //             maxi = Math.max(sum,maxi);
        //         }
        //     }
        // }
        // for(int i =0;i<n;i++){
        //     int sum =0;
        //     for(int j =i ;j<n;j++){
        //         sum += arr[j];
        //         maxi = Math.max(sum,maxi);}
        // }
        // Optimized approach
        int sum  =0;
        for(int i =0;i<n;i++){
            sum +=arr[i];
            if(sum>maxi){
                maxi = sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return maxi;
    }
    public static  void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArraySum(arr));
    }
}
