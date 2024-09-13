public class Fibdptab {

    public static int CountWaysTabulation(int n){
        int dp[]=new int[n+1];
        dp[0]=1;

        //tabulation loop
        for(int i=1;i<=n;i++){
            if(i==1){
                dp[i]=dp[i-1];
            }
            else{
                dp[i]=dp[i-1]+dp[i-2];
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n=2;
        System.out.println(CountWaysTabulation(n));
    }
}
