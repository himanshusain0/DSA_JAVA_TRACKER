// this file have only the method not actual implementation
class RotateMatrix {
    public static void rotate(int[][] matrix) {

        int n = matrix.length;
        int[][] resMatrix =new int[n][n];
        for(int i =0;i<n;i++){
            for(int j=0;j<n;j++){
                resMatrix[j][n-1-i]=matrix[i][j];
            }
        }
        for(int i =0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix [i][j] = resMatrix[i][j];
            }
        }
        
        // Implementation goes here
        // This method should rotate the given matrix by 90 degrees clockwise
    }
}