package atharva.StringNStringBuilder;

public class Reverse {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("Atharva");
//        tc O(n)
        for(int i=0;i<str.length()/2;i++){
            int front=i;
            int back=str.length()-1-i;
            char frontChar=str.charAt(front);
            char backChar=str.charAt(back);

            str.setCharAt(front,backChar);
            str.setCharAt(back,frontChar);
        }
        System.out.print(str);
    }
}
