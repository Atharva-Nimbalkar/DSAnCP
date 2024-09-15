public class Palindrome9 {

    static  int num=0;
    static void rev(int n){
        if(n==0){
            return;
        }
        int rem=n%10;
        num=num*10+rem;
        rev(n/10);
    }

    static boolean palin(int n){
        if(n<0){
            return false;
        }
        return n == num;
    }

    public static void main(String[] args) {
        int n=-2002;
        rev(n);
        System.out.print(palin(n));
    }
}
