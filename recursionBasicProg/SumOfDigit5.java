public class SumOfDigit5 {

    public static void main(String[] args){
        int result= SumOfDigit5.sumOfDigits(99);
        System.out.println(result);
    }
    static int sumOfDigits(int N) {
        int sum=0;
        if(N>0){
            sum+=N%10;
            N=N/10;
            sum+=sumOfDigits(N);
        }
        return sum;
    }

}

//No, the above problem does not come under tail recursion. Tail recursion occurs when the recursive call is the last operation in the recursive function, and no further computation is needed after the recursive call returns.
// In the provided code, the recursive call sumOfDigits(N); is not a tail call because there is still an operation to be performed after the recursive call.

//    A tail-recursive version of the sumOfDigits function would look like this:
//class Solution {
//    static int sumOfDigits(int N, int sum) {
//        if (N == 0) {
//            return sum;
//        }
//        sum += N % 10;
//        N = N / 10;
//        return sumOfDigits(N, sum);
//    }
//
//    public static void main(String[] args) {
//        int result = Solution.sumOfDigits(12, 0);
//        System.out.println("Sum of digits: " + result);
//    }
//}