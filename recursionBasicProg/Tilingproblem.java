public class Tilingproblem {

    public static int CountWaysOfTiling(int n){
        if(n==0 || n==1){
            return 1;
        }

        //vertical tiling (2*n-1)
        int filltiles1=CountWaysOfTiling(n-1);

        //horizontal tiling
        int filltiles2=CountWaysOfTiling(n-2);
        int totalWays=filltiles1+filltiles2;
        return totalWays;
    }
    public static void main(String[] args) {
        System.out.println(CountWaysOfTiling(4));
    }
}
