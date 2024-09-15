public class ProductNo6 {

    static int product(int n){
        if(n%10==n){
            return n;
        }
        return (n%10)*product(n/10);
    }

    public static void main(String[] args){
        int res=product(1432);
        System.out.println(res);
    }
}
