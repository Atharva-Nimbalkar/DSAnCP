import java.util.Stack;
//PS: revers A Stack
public class StackQ2 {
//
    public static void pushAtBottom(Stack<Integer> st, int data){
        if(st.isEmpty()){
            st.push(data);
             return;
        }
        int top=st.pop();
        pushAtBottom(st,data);
        st.push(top);
    }
    public static void reverseStack(Stack<Integer>st){
            if(st.isEmpty()){
                return;
            }
            int top=st.pop();
            reverseStack(st);
            pushAtBottom(st,top);
    }

    public static void printStack(Stack<Integer> st) {
        while (!st.isEmpty()){
            System.out.println(st.pop());
        }
    }

    public static void main(String[] args) {
            Stack<Integer>st=new Stack<>();
            st.push(11);
            st.push(22);
            st.push(33);

            //33//22//11pop order
            reverseStack(st);
            printStack(st);
            //11//22/33//after reverse order
    }


}
