public class ConceptPass7 {

    static void Pass(int n){

        if(n==0){
            return;
        }
        System.out.println(n);
        Pass(--n);
    }
    public static void main(String[] args) {
        Pass(6);
    }
}
