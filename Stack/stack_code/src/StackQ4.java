import java.util.*;

//PS: Next greater Element II
//Not this is not circular iteratory do circular iteration
public class StackQ4 {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,3};
        Stack<Integer> st=new Stack<>();
        int[] nextGreater=new int[arr.length];
        //tc will be O(n)+O(2n)=O(n)
        for(int i=arr.length-1;i>=0;i--){//O(n)
            //while loop
            while(!st.isEmpty()&&arr[st.peek()]<=arr[i]){//in 2nd and condition we store index of element in stack
                st.pop();//remove the smallest element here tc will O(2n) bcz every element
                        //enter and also pop/remove from stack  but still we
            }
            //if else
            if(st.isEmpty()){
                nextGreater[i]=-1;
            }
            else{
                nextGreater[i]=arr[st.peek()];
            }
            //push
            st.push(i);
        }
        for(int i=0;i< nextGreater.length;i++){
            System.out.print(nextGreater[i]+" ");
        }
    }
    //next greater right this solution
    //next greater left  just reverse the for loop
    //next smaller right just reverse while loop 2nd and condition
    //next smaller left just reverse both for loop and while loop
}
