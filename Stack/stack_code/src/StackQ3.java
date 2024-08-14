import java.util.Stack;

//    ps:stock span problem
public class StackQ3 {

    public static void stockSpan(int stock[],int span[]){
        Stack<Integer>st=new Stack<>();
        st.push(0);
        span[0]=1;
        for(int i=0;i<stock.length;i++){
            int currPrice=stock[i];
            while(!st.isEmpty()&& currPrice>=stock[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                span[i]=i+1;
            }
            else{
                int previousHigh= st.peek();
                span[i]=i-previousHigh;
            }
            st.push(i);
        }
    }

    public static void main(String[] args) {
        int stock[]={100,80,60,70,60,85,100};
        int span[]=new int[stock.length];
        stockSpan(stock,span);

        for(int j=0;j<span.length;j++){
            System.out.println(span[j]+"");
        }
    }
}
