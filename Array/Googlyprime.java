package atharva.com;
//accenture pvq
//googly prime number is defined as number that is derived from the sum of its individual digits
public class Googlyprime {
    public static boolean googlyprimenumber(int n){
        int ans=0;
        while(n!=0){
            int x=n%10;
            n=n/10;
            ans+=x;
        }
        for(int i=2;i<Math.sqrt(ans);i++){
            if(ans%i==0)return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(googlyprimenumber(1235));
    }
}
