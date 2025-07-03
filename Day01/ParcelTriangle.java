import java.util.ArrayList;
import java.util.List;

class ParcelTriangle{
    public static List<Integer> generateRow(int n){
         long ans =1;
        List<Integer> ansRow = new ArrayList<>();
        ansRow.add(1);
        for(int i =1;i<n;i++){
            ans = ans *n-i;
            ans = ans / (i);
            ansRow.add((int)ans);
            }
            return ansRow;
    }

    public static List<List<Integer>> parcelTriangle(int n){
        List<List<Integer>> ANS = new  ArrayList<>();
        for(int i =0;i<n;i++){
            ANS.add(generateRow(i));
        }
        return ANS;
    }
    public static void main(String[] args) {
        int n =5;
        List<List<Integer>> ans = parcelTriangle(n);
        for(List<Integer> it : ans){
            for(int ele : it){
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}