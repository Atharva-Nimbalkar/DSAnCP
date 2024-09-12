import java.util.Arrays;

public class Fibdpmemo {
    //recursion + memorization as
    //rec tc O(2^N) and rec+memo O(n)
    public static int Climbrecmemo(int n,int[] memo){
        if(n==0) return 1;
        if(n<0) return 0;

        if(memo[n]!=-1)return memo[n];

        memo[n]=Climbrecmemo(n-1,memo)+Climbrecmemo(n-2,memo);

        return memo[n];
    }
    public static void main(String[] args) {
        int n=5;
        int[] memo=new int[n+1];
        Arrays.fill(memo,-1);
        System.out.println(Climbrecmemo(n,memo));
    }
}
