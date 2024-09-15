public class NumberRecursion {

    public static void main(String[] args) {
        print1toN(5);
        System.out.println();
//        printNto1(10);
    }

    static void print1toN(int n){
        if(n>0){//Base condition
            //line 10 is also call tail recursion becasuse that is last function/statement call
            print1toN(n-1);//Recursion

            System.out.print(n+" ");//Body
            //line 13 n 10 can also be in reverse order depend on situation

        }
    }

    static void printNto1(int m){

        if(m==0){
            return;
        }
        System.out.print(m+" ");
        printNto1(m-1);
    }



}
