public class NumberRev8 {

    static int num=0;
    static void Reverse1(int n){
        if(n==0){
            return;
        }
        int rem=n%10;
        num=num*10+rem;
        Reverse1(n/10);
    }

    static int Reverse2(int n){
        //sometimes u might need some additinonall variables in the argument
        //in that case,make another function

        int digits=(int)(Math.log10(n)+1);
        return helper(n,digits);
    }

    private static int helper(int n,int digit){
        if(n%10==n){
            return n;
        };

        int rem=n%10;
        return rem*(int)(Math.pow(10,digit-1))+helper(n/10,digit-1);
    }



    public static void main(String[] args) {
            Reverse1(1802);
            System.out.println(num);
            System.out.print(Reverse2(1234));
    }
}
