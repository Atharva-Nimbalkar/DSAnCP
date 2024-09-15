public class Climbstir {

    public static int TotalSteps(int n){
        if(n==0)return 1; //steps to go at first is 0 itself bcz man is standing their itself.
        if(n<0) return 0;
        return TotalSteps(n-1)+TotalSteps(n-2);//recursion
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(TotalSteps(n));
    }
}
