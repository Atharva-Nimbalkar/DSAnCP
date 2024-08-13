import java.util.Stack;

public class StackQ1 {
//    push any no at bottom of stack using recursion
    public static void pushAtBottom(Stack<Integer>s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushAtBottom(s,data);
        s.push(top);
    }

    public static String reverseString(String str){
        Stack<Character>NewStrStack=new Stack<>();
        int idx=0;
        while (idx<str.length()){
            NewStrStack.push(str.charAt(idx));
            idx++;
        }

        StringBuilder result=new StringBuilder("");//here we take element from stack and put into Stringbuilder
        while(!NewStrStack.isEmpty()){
            char curr=NewStrStack.pop();
            result.append(curr);
        }
        str=result.toString();
        return str;
    }


public static void main(String[] args) {
    Stack<Integer>s=new Stack<>();
    s.push(11);
    s.push(23);
    s.push(34);

    pushAtBottom(s,3);

//    to print element from top of stack to bottom of the stack.
    while (!s.isEmpty()){
        System.out.println(s.pop());
    }

//    String str="abc";
//    String result=reverseString(str);
//    System.out.println(result);
}
}
