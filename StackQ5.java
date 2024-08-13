

//ps Maximum Area of Histogram Problem

import java.util.Stack;

public class StackQ5 {
    public static void maxArea(int[] arr){
        Stack<Integer>st=new Stack<>();
        int nsr[]=new int[arr.length];
        int nsl[]=new int[arr.length];
        int area=0;
        //next left smaller elemnet

//        To find area of reactangle we need width n ht
//        width=next smaller left-next (j)-smaller right(i)-1.
// in right side case we cant not insert -1 because we calculating the width if both -1 give zero so
// we add legnth of array
        for(int i= arr.length-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nsr[i]= arr.length;
            }
            else{
                nsr[i]=st.peek();
            }
            st.push(i);
        }
        //next right smaller element
        st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nsl[i]=-1;
            }
            else{
                nsl[i]=st.peek();
            }
            st.push(i);
        }
        for(int i=0;i<arr.length;i++){
            int ht=arr[i];
            int wt=nsr[i]-nsl[i]-1;
            int currArea=ht*wt;
            area=Math.max(area,currArea);
        }
        System.out.println("Maximum area in histogram : "+ area);
    }
    public static void main(String[] args) {
        int arr[]={2,1,5,6,2,3};
        maxArea(arr);
    }
}
